package com.cyssxt.telegrambotsdk4j.methods;

import com.cyssxt.telegrambotsdk4j.BotInfo;
import com.cyssxt.telegrambotsdk4j.req.DeleteWebhookReq;
import com.cyssxt.telegrambotsdk4j.req.SetWebhookReq;
import com.cyssxt.telegrambotsdk4j.req.UpdateReq;
import com.cyssxt.telegrambotsdk4j.type.Response;
import com.cyssxt.telegrambotsdk4j.type.WebhookInfo;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Builder
public class ActionFactory {
    private String key;
    private String token;
    private String notifyUrl;
    private String channelName;
    private final static Map<String,ActionFactory> FACTORY_MAP = new HashMap<>();

    public static ActionFactory getInstance(String key){
        return FACTORY_MAP.get(key);
    }
    public static boolean init(String key,String token,String notifyUrl){
        return init(key,token,notifyUrl,null);
    }
    public static boolean init(String key,String token,String notifyUrl,String channelName){
        ActionFactory actionFactory = FACTORY_MAP.get(key);
        log.info("init");
        if (notifyUrl == null || "".equals(notifyUrl)) {
            return false;
        }
        boolean repeat = false;
        if(actionFactory==null) {
            actionFactory = new ActionFactory(key, token, notifyUrl,channelName);
        }else{
            repeat = true;
        }
        actionFactory.token = token;
        actionFactory.notifyUrl = notifyUrl;
        actionFactory.key = key;
        actionFactory.channelName = channelName;
        try {
            notifyUrl = notifyUrl+"/api/hook/"+key;
            log.info("init key={},token={},notifyUrl={},repeat={}",key,token,notifyUrl,repeat);
            BaseAction<UpdateReq, WebhookInfo> getWebhookInfoAction = actionFactory.create(GetWebhookInfoAction.class);
            UpdateReq hookInfo = new UpdateReq();
            Response<WebhookInfo> response = getWebhookInfoAction.send(hookInfo);
            WebhookInfo result = response.getResult();
            log.info("result={}",result);
            String url = result.getUrl();
            if(url!=null && !notifyUrl.equals(url)){
                BaseAction<DeleteWebhookReq, Boolean> deleteWebhookReqBooleanBaseAction = actionFactory.create(DeleteWebhookAction.class);
                DeleteWebhookReq t = new DeleteWebhookReq();
                t.setDropPendingUpdates(true);
                deleteWebhookReqBooleanBaseAction.send(t);
                BaseAction<SetWebhookReq, String> baseAction = actionFactory.create(SetWebhookAction.class);
                SetWebhookReq param = new SetWebhookReq();
                param.setUrl(notifyUrl);
                Response<String> send = baseAction.send(param);
                log.info("set webhook={}", send);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        FACTORY_MAP.put(key,actionFactory);
        return true;
    }

    public static Boolean init(BotInfo botInfo) {
        return init(botInfo.getKey(),botInfo.getToken(),botInfo.getHook(),botInfo.getChannelName());
    }

    public <T,V> BaseAction<T, V> create(Class<? extends BaseAction<T,V>> action) throws InstantiationException, IllegalAccessException {
        BaseAction<T, V> tvBaseAction = action.newInstance();
        tvBaseAction.setToken(this.token);
        tvBaseAction.setKey(this.key);
        return tvBaseAction;
    }
    public static void quickSend(String key, String message, List<Map<String, String>> hrefs){
        quickSend(key,message,hrefs,null);
    }
    public static void quickSend(String key, String message, List<Map<String, String>> hrefs,Object chatId){
        ActionFactory instance = ActionFactory.getInstance(key);
        log.info("key={},instance={}",key,instance);
        if(instance==null || instance.channelName==null || "".equals(instance.channelName)){
            log.info("quickSend key={},message={}",key,message);
            return;
        }
        if(chatId==null) {
            if (!instance.channelName.startsWith("@")) {
                chatId = "@" + instance.channelName;
            }
        }
        try {
            SendMessageAction.sendMessageHrefs(instance,message,chatId,hrefs);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public void quickSend(String message, List<Map<String, String>> hrefs){
        quickSend(message,hrefs,null);
    }
    public void quickSend(String message, List<Map<String, String>> hrefs,Object chatId){
        ActionFactory instance = this;
        log.info("key={},instance={},channelName={}",key,instance,instance.channelName);
        if(instance==null || instance.channelName==null || "".equals(instance.channelName)){
            log.info("quickSend key={},message={}",key,message);
            return;
        }
        if(chatId==null) {
            if (!instance.channelName.startsWith("@")) {
                chatId = "@" + instance.channelName;
            }
        }
        try {
            SendMessageAction.sendMessageHrefs(instance,message,chatId,hrefs);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String key = "111";
        ActionFactory.init("111","bot5322114431:AAFZIBj89J5OIFtDtkmuPKRE1K7cYjzFqTA","https://telegram.fenliu.cc");
        boolean troNminingmachine = GetChatMemberAction.isMemeber(ActionFactory.getInstance(key), 5096724011l, "TRONminingmachine");
        System.out.println(troNminingmachine);
    }

}
