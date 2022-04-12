package com.cyssxt.telegrambotsdk4j.type;

import com.alibaba.fastjson.annotation.JSONField;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import java.util.List;

//https://core.telegram.org/bots/api#inlinekeyboardmarkup
@Data
public class ReplyKeyboardMarkup {
    @JSONField(name="keyboard")
    List<List<KeyboardButton>> keyboard;

    @JSONField(name="one_time_keyboard")
    Boolean oneTimeKeyboard;

    @JSONField(name="resize_keyboard")
    Boolean resizeKeyboard;
}
