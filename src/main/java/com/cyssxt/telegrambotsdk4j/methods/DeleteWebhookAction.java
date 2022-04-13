package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.DeleteWebhookReq;
import com.cyssxt.telegrambotsdk4j.type.Response;

import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.DELETE_WEBHOOK;

public class DeleteWebhookAction extends BaseAction<DeleteWebhookReq, Boolean> {

    @Override
    public String getMethod() {
        return DELETE_WEBHOOK;
    }

    @Override
    public TypeReference<Response<Boolean>> getTypeReference() {
        return new TypeReference<Response<Boolean>>(){};
    }
}
