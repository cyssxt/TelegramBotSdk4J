package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#messageentity
 */
@Data
public class MessageEntity {
    String type;
    Integer offset;
    Integer length;
    String url;
    User user;
    String language;
}
