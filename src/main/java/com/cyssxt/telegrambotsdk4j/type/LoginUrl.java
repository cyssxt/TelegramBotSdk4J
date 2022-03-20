package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;
//https://core.telegram.org/bots/api#loginurl
@Data
public class LoginUrl {
    String url;
    String forwardText;
    String botUsername;
    String requestWriteAccess;
}
