package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

import java.util.List;

//https://core.telegram.org/bots/api#inlinekeyboardmarkup
@Data
public class InlineKeyboardMarkup {
    List<InlineKeyboardButton> inline_keyboard;
}
