package com.cyssxt.telegrambotsdk4j.methods;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
public class ActionFactory {
    private static String token;

    public static void init(String token){
        ActionFactory.token = token;
    }

    public static <T,V> BaseAction<T, V> create(Class<? extends BaseAction<T,V>> action) throws InstantiationException, IllegalAccessException {
        BaseAction<T, V> tvBaseAction = action.newInstance();
        tvBaseAction.setToken(token);
        return tvBaseAction;
    }


}
