package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.DeleteWebhookReq;
import com.cyssxt.telegrambotsdk4j.type.Response;

import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.ANSWER_CALLBACK_QUERY;
import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.DELETE_WEBHOOK;

public class AnswerCallbackQueryAction extends BaseAction<AnswerCallbackReq, Boolean> {

    @Override
    public String getMethod() {
        return ANSWER_CALLBACK_QUERY;
    }

    @Override
    public TypeReference<Response<Boolean>> getTypeReference() {
        return new TypeReference<Response<Boolean>>(){};
    }
}
