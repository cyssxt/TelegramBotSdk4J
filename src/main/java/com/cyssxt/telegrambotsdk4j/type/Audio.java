package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#audio
 */
@Data
public class Audio {
    Integer fileId;
    Integer fileUniqueId;
    Integer duration;
    String performer;
    String title;
    String fileName;
    String mimeType;
    Integer fileSize;
    PhotoSize thumb;
}
