package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.SendMessageReq;
import com.cyssxt.telegrambotsdk4j.type.Message;
import com.cyssxt.telegrambotsdk4j.type.Response;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.BASE_API;

@Slf4j
@Data
public abstract class BaseAction<T,V> {

    public abstract String getMethod();

    public String getUrl(){
        return String.format("%s/bot%s/%s",BASE_API,token,getMethod());
    }

    String token;
    public Response<V> send(T t) throws UnirestException {
        String url = getUrl();
        log.info("send url={}",url);
        String params = JSON.toJSONString(t);
        log.info("params={}",params);
        HttpResponse<String> stringHttpResponse = Unirest.post(url).header("Content-Type","application/json").body(params).asString();
        String body = stringHttpResponse.getBody();
        log.info("body={}",body);
        Response<V> response = JSON.parseObject(body, getTypeReference());
        return response;
    }

    public abstract TypeReference<Response<V>> getTypeReference();

    public static void main(String[] args) throws UnirestException, InstantiationException, IllegalAccessException {
        ActionFactory.init("5199907604:AAGib3wDJwyKYrJ2QBgiUlVs9LKzXcbqV9w");
        BaseAction<SendMessageReq, Message> getUpdatesAction = ActionFactory.create(SendMessageAction.class);
        SendMessageReq t = new SendMessageReq();
        t.setChatId("-728082078");
        t.setText("123123");
        Response<Message> send = getUpdatesAction.send(t);
        System.out.println(send);
//        BaseAction<UpdateReq, Update> getUpdatesAction = ActionFactory.create(GetUpdatesAction.class);
//        UpdateReq req = new UpdateReq();
//        Response<Update> send = getUpdatesAction.send(req);
//        System.out.println(send);
//        ActionFactory<Object,UpdateVo> requestAction = GetUpdatesAction.create("getUpdates", "5199907604:AAGib3wDJwyKYrJ2QBgiUlVs9LKzXcbqV9w");
//        Response<UpdateVo> send = requestAction.send(null);
//        log.info("send={}",send);
    }
}
