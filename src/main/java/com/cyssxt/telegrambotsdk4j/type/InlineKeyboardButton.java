package com.cyssxt.telegrambotsdk4j.type;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

//https://core.telegram.org/bots/api#inlinekeyboardbutton
@Data
public class InlineKeyboardButton {
    String text;
    String url;
    @JSONField(name="login_url")
    LoginUrl loginUrl;
    @JSONField(name="callback_data")
    String callbackData;
    @JSONField(name="switch_inline_query_current_chat")
    String switchInlineQueryCurrentChat;
    @JSONField(name="switch_inline_query")
    String switchInlineQuery;
    @JSONField(name="callback_game")
    CallbackGame callbackGame;
    @JSONField(name="pay")
    Boolean pay;
}
