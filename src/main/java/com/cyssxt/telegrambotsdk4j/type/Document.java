package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#document
 */
@Data
public class Document {
    String fileId;
    String fileUniqueId;
    PhotoSize thumb;
    String fileName;
    String mimeType;
    Integer fileSize;
}
