package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#photosize
 */
@Data
public class PhotoSize {
    String fileId;
    String fileUniqueId;
    Integer width;
    Integer height;
    Integer fileSize;
}
