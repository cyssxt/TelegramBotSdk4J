package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

import java.util.List;

@Data
public class Response<T> {
    Boolean ok;
    List<T> result;
}
