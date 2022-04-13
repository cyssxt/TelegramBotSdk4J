package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.SendMessageReq;
import com.cyssxt.telegrambotsdk4j.type.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SendPhotoAction extends BaseAction<SendPhotoReq, Message> {

    @Override
    public String getMethod() {
        return "sendPhoto";
    }

    @Override
    public TypeReference<Response<Message>> getTypeReference() {
        return new TypeReference<Response<Message>>(){};
    }

    public static void setPhoto(ActionFactory actionFactory,Long chatId,String caption,String photo) throws InstantiationException, IllegalAccessException {
        BaseAction<SendPhotoReq, Message> baseAction = actionFactory.create(SendPhotoAction.class);
        SendPhotoReq t = new SendPhotoReq();
        t.setChatId(chatId);
        t.setPhoto(photo);
        t.setCaption(caption);
        baseAction.send(t);
    }
}
