package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

//https://core.telegram.org/bots/api#inlinekeyboardbutton
@Data
public class InlineKeyboardButton {
    String text;
    String url;
    LoginUrl loginUrl;
    String callbackData;
    String switchInlineQuery;
    String switchInlineQueryCurrentChat;
    CallbackGame callbackGame;
    Boolean pay;
}
