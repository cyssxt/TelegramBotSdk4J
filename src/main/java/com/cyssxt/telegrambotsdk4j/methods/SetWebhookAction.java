package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.SetWebhookReq;
import com.cyssxt.telegrambotsdk4j.req.UpdateReq;
import com.cyssxt.telegrambotsdk4j.type.MessageResult;
import com.cyssxt.telegrambotsdk4j.type.Response;
import kong.unirest.HttpRequest;
import kong.unirest.RequestBodyEntity;
import kong.unirest.Unirest;

import java.util.HashMap;
import java.util.Map;

import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.GET_UPDATES;
import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.SET_WEBHOOK;

public class SetWebhookAction extends BaseAction<SetWebhookReq, String> {

    @Override
    public String getMethod() {
        return SET_WEBHOOK;
    }

    @Override
    public TypeReference<Response<String>> getTypeReference() {
        return new TypeReference<Response<String>>(){};
    }

    @Override
    public boolean isForm() {
        return false;
    }
}

