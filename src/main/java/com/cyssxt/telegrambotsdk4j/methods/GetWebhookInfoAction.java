package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.UpdateReq;
import com.cyssxt.telegrambotsdk4j.type.MessageResult;
import com.cyssxt.telegrambotsdk4j.type.Response;
import com.cyssxt.telegrambotsdk4j.type.WebhookInfo;

import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.GET_UPDATES;
import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.GET_WEBHOOK_INFO;

public class GetWebhookInfoAction extends BaseAction<UpdateReq, WebhookInfo> {

    @Override
    public String getMethod() {
        return GET_WEBHOOK_INFO;
    }

    @Override
    public TypeReference<Response<WebhookInfo>> getTypeReference() {
        return new TypeReference<Response<WebhookInfo>>(){};
    }
}
