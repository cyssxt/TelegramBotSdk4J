package com.cyssxt.telegrambotsdk4j.type;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MessageResult {
    String updateId;
    Message message;
    @JSONField(name="callback_query")
    CallbackQuery callbackQuery;
}
