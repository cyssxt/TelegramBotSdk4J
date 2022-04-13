package com.cyssxt.telegrambotsdk4j.methods;

import com.cyssxt.telegrambotsdk4j.req.DeleteWebhookReq;
import com.cyssxt.telegrambotsdk4j.req.SetWebhookReq;
import com.cyssxt.telegrambotsdk4j.req.UpdateReq;
import com.cyssxt.telegrambotsdk4j.type.Response;
import com.cyssxt.telegrambotsdk4j.type.WebhookInfo;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Builder
public class ActionFactory {
    private String key;
    private String token;
    private String notifyUrl;
    private final static Map<String,ActionFactory> FACTORY_MAP = new HashMap<>();

    public static ActionFactory getInstance(String key){
        return FACTORY_MAP.get(key);
    }

    public static void init(String key,String token,String notifyUrl){
        ActionFactory actionFactory = FACTORY_MAP.get(key);
        if(actionFactory==null) {
            actionFactory = new ActionFactory(key, token, notifyUrl);
            actionFactory.token = token;
            if (notifyUrl == null || "".equals(notifyUrl)) {
                return;
            }
            try {
                log.info("init key={},token={},notifyUrl={}",key,token,notifyUrl);
                BaseAction<UpdateReq, WebhookInfo> getWebhookInfoAction = actionFactory.create(GetWebhookInfoAction.class);
                UpdateReq hookInfo = new UpdateReq();
                Response<WebhookInfo> response = getWebhookInfoAction.send(hookInfo);
                WebhookInfo result = response.getResult();
                log.info("result={}",result);
                String url = result.getUrl();
                if(url!=null && !url.startsWith(notifyUrl)){
                    BaseAction<DeleteWebhookReq, Boolean> deleteWebhookReqBooleanBaseAction = actionFactory.create(DeleteWebhookAction.class);
                    DeleteWebhookReq t = new DeleteWebhookReq();
                    t.setDropPendingUpdates(true);
                    deleteWebhookReqBooleanBaseAction.send(t);
                }
                BaseAction<SetWebhookReq, String> baseAction = actionFactory.create(SetWebhookAction.class);
                SetWebhookReq param = new SetWebhookReq();
                param.setUrl(notifyUrl);
                Response<String> send = baseAction.send(param);
                log.info("set webhook={}", send);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public <T,V> BaseAction<T, V> create(Class<? extends BaseAction<T,V>> action) throws InstantiationException, IllegalAccessException {
        BaseAction<T, V> tvBaseAction = action.newInstance();
        tvBaseAction.setToken(this.token);
        tvBaseAction.setKey(this.key);
        return tvBaseAction;
    }

}
