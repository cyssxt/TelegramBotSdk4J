package com.cyssxt.telegrambotsdk4j.type;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

//https://core.telegram.org/bots/api#inlinekeyboardmarkup
@Data
public class InlineKeyboardMarkup {
    @JSONField(name="inline_keyboard")
    List<List<InlineKeyboardButton>> inlineKeyboard;
}
