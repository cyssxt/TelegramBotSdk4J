package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

// https://core.telegram.org/bots/api#chatphoto
@Data
public class ChatPhoto {
    String smallFileId;
    String smallFileUniqueId;
    String bigFileId;
    String bigFileUniqueId;
}
