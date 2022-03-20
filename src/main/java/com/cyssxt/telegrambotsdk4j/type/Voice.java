package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#voice
 */
@Data
public class Voice {
    String fileId;
    String fileUniqueId;
    Integer duration;
    PhotoSize thumb;
    String mimeType;
    Integer fileSize;
}
