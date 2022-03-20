package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#videonote
 */
@Data
public class VideoNote {
    String fileId;
    String fileUniqueId;
    Integer length;
    Integer duration;
    Integer fileSize;
    PhotoSize thumb;
}
