package com.cyssxt.telegrambotsdk4j.methods;

import com.cyssxt.telegrambotsdk4j.type.MessageResult;

public interface UpdateCallback {

    void receive(MessageResult result,String botKey) throws InstantiationException, IllegalAccessException;
}
