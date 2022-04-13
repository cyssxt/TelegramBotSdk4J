package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.SendMessageReq;
import com.cyssxt.telegrambotsdk4j.type.InlineKeyboardButton;
import com.cyssxt.telegrambotsdk4j.type.InlineKeyboardMarkup;
import com.cyssxt.telegrambotsdk4j.type.Message;
import com.cyssxt.telegrambotsdk4j.type.Response;
import com.cyssxt.telegrambotsdk4j.util.ParamUtil;
import kong.unirest.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.BASE_API;

@Slf4j
@Data
public abstract class BaseAction<T,V> {

    public abstract String getMethod();

    public String getUrl(){
        return String.format("%s/bot%s/%s",BASE_API,token,getMethod());
    }

    public boolean isForm(){
        return false;
    }

    String token;
    private String key;
    public Response<V> send(T t) throws UnirestException {
        String url = getUrl();
        HttpResponse<String> stringHttpResponse = (isForm()?createFormReq(url,t):createReq(url,t)).asString();
        String body = stringHttpResponse.getBody();
        log.info("body={}",body);
        Response<V> response = JSON.parseObject(body, getTypeReference());
        return response;
    }

    public HttpRequest createReq(String url,T t){
        log.info("send url={}",url);
        String params = JSON.toJSONString(t);
        log.info("params={}",params);
        HttpRequest body = Unirest.post(url).header("Content-Type", "application/json").body(params);
        return body;
    }

    public HttpRequest createFormReq(String url,T t){
        log.info("send url={}",url);
        Map<String, Object> params = ParamUtil.parse(t);
        log.info("params={}",params);
        MultipartBody fields = Unirest.post(url).header("Content-Type", "multipart/form-data").fields(params);
        return fields;
    }

    public abstract TypeReference<Response<V>> getTypeReference();

    public static void main(String[] args) throws UnirestException, InstantiationException, IllegalAccessException {
//        ActionFactory.init("5199907604:AAGib3wDJwyKYrJ2QBgiUlVs9LKzXcbqV9w");
//        BaseAction<SendMessageReq, Message> getUpdatesAction = ActionFactory.create(SendMessageAction.class);
//        SendMessageReq t = new SendMessageReq();
//        t.setChatId("-728082078");
//        t.setText("as冻结2斤来看加31斤3就开奖了2级颗粒剂链就👁3记录卡2斤了23");
//        InlineKeyboardMarkup btns = new InlineKeyboardMarkup();
//        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
//        List<InlineKeyboardButton> keybord = new ArrayList<>();
//        InlineKeyboardButton e = new InlineKeyboardButton();
////        e.getCallbackData();
//        e.setText("分享");
//        e.setCallbackData("回调函数");
////        e.setUrl("https://www.baidu.com");
//        keybord.add(e);
//        rows.add(keybord);
//        btns.setInlineKeyboard(rows);
//        t.setReplyMarkup(btns);
//        Response<Message> send = getUpdatesAction.send(t);
//        System.out.println(send);
//        BaseAction<UpdateReq, Update> getUpdatesAction = ActionFactory.create(GetUpdatesAction.class);
//        UpdateReq req = new UpdateReq();
//        Response<Update> send = getUpdatesAction.send(req);
//        System.out.println(send);
//        ActionFactory<Object,UpdateVo> requestAction = GetUpdatesAction.create("getUpdates", "5199907604:AAGib3wDJwyKYrJ2QBgiUlVs9LKzXcbqV9w");
//        Response<UpdateVo> send = requestAction.send(null);
//        log.info("send={}",send);
    }
}
