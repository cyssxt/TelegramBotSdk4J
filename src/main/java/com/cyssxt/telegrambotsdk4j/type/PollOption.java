package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

//https://core.telegram.org/bots/api#polloption
@Data
public class PollOption {
    String text;
    Integer voterCount;
}
