package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;
//https://core.telegram.org/bots/api#sticker
@Data
public class Sticker {
    String fileId;
    String fileUniqueId;
    Integer width;
    Integer height;
    Boolean isAnimated;
    Boolean isVideo;
    PhotoSize thumb;
    String emoji;
    String setName;
    MaskPosition maskPosition;
    Integer fileSize;
}
