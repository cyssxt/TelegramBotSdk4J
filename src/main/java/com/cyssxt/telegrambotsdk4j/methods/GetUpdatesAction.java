package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.UpdateReq;
import com.cyssxt.telegrambotsdk4j.type.Response;
import com.cyssxt.telegrambotsdk4j.type.MessageResult;
import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.GET_UPDATES;

public class GetUpdatesAction extends BaseAction<UpdateReq, MessageResult> {

    @Override
    public String getMethod() {
        return GET_UPDATES;
    }

    @Override
    public TypeReference<Response<MessageResult>> getTypeReference() {
        return new TypeReference<Response<MessageResult>>(){};
    }
}
