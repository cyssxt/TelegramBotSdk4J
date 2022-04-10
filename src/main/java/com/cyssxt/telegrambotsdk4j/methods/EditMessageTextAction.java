package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.SendMessageReq;
import com.cyssxt.telegrambotsdk4j.type.Message;
import com.cyssxt.telegrambotsdk4j.type.Response;

public class EditMessageTextAction extends BaseAction<SendMessageReq, Message> {

    @Override
    public String getMethod() {
        return "editMessageText";
    }

    @Override
    public TypeReference<Response<Message>> getTypeReference() {
        return new TypeReference<Response<Message>>(){};
    }
}
