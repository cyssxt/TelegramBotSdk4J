package com.cyssxt.telegrambotsdk4j;

import lombok.Data;

@Data
public class BotInfo {
    String token;
    Boolean reply;
    String hook;
    String key;
    String channelName;
}
