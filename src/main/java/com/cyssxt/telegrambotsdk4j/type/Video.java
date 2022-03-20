package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#video
 */
@Data
public class Video {
    String fileId;
    String fileUniqueId;
    Integer width;
    Integer height;
    Integer duration;
    PhotoSize thumb;
    String fileName;
    String mimeType;
    Integer fileSize;
}
