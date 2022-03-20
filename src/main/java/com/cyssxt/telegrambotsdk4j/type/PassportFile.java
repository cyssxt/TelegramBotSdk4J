package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

//https://core.telegram.org/bots/api#passportfile
@Data
public class PassportFile {
    String fileId;
    String fileUniqueId;
    Integer fileSize;
    Integer fileDate;
}
