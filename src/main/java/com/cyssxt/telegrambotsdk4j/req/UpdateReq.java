package com.cyssxt.telegrambotsdk4j.req;

import lombok.Data;

import java.util.List;

// https://core.telegram.org/bots/api#getupdates
@Data
public class UpdateReq {
    Integer offset=0;
    Integer limit=100;
    Integer timeout;
    List<String> allowedUpdates;
}
