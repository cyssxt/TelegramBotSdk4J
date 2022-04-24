package com.cyssxt.telegrambotsdk4j;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BotInfo {
    String token;
    Boolean reply;
    String hook;
    String key;
    String channelName;
}
