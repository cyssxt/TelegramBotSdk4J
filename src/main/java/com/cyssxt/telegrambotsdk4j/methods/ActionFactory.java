package com.cyssxt.telegrambotsdk4j.methods;

import com.cyssxt.telegrambotsdk4j.req.SetWebhookReq;
import com.cyssxt.telegrambotsdk4j.type.Response;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
public class ActionFactory {
    private static String token;
    private static String notifyUrl;
    public static void init(String token){
        init(token,null);
    }
    public static void init(String token,String notifyUrl){
        ActionFactory.token = token;
        if(notifyUrl==null || "".equals(notifyUrl)){
            return;
        }
        try {
            BaseAction<SetWebhookReq, String> baseAction = ActionFactory.create(SetWebhookAction.class);
            SetWebhookReq param = new SetWebhookReq();
            param.setUrl(notifyUrl);
            Response<String> send = baseAction.send(param);
            log.info("set webhook={}",send);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static <T,V> BaseAction<T, V> create(Class<? extends BaseAction<T,V>> action) throws InstantiationException, IllegalAccessException {
        BaseAction<T, V> tvBaseAction = action.newInstance();
        tvBaseAction.setToken(token);
        return tvBaseAction;
    }

}
