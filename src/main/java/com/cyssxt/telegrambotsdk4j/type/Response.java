package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

import java.util.List;

@Data
public class Response<T> {
    Boolean ok;
    T result;

    public static Response success() {
        Response  response = new Response();
        response.setOk(true);
        return response;
    }

    public boolean isOk(){
        return ok!=null && ok;
    }
}
