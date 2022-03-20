package com.cyssxt.telegrambotsdk4j.methods;

import com.cyssxt.telegrambotsdk4j.constant.ApiConstant;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class MethodAction {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<String> stringHttpResponse = Unirest.post(ApiConstant.BASE_API + "5199907604:AAGib3wDJwyKYrJ2QBgiUlVs9LKzXcbqV9w/getUpdates").asString();
        System.out.println(stringHttpResponse.getBody());
    }

}
