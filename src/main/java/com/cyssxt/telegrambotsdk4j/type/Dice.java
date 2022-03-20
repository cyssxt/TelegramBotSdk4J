package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#dice
 */
@Data
public class Dice {
    String emoji;
    Integer value;
}
