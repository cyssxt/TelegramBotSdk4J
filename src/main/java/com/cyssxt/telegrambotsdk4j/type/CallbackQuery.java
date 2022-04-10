package com.cyssxt.telegrambotsdk4j.type;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CallbackQuery {
    String id;
    User from;
    Message message;
    @JSONField(name="inline_message_id")
    String inlineMessageId;
    @JSONField(name="chat_instance")
    String chatInstance;
    @JSONField(name="data")
    String data;
    @JSONField(name="game_short_name")
    String gameShortName;
}
