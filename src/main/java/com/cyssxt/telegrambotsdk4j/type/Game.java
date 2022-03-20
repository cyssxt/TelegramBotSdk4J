package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

import java.util.List;

//https://core.telegram.org/bots/api#game
@Data
public class Game {
    String title;
    String description;
    List<PhotoSize> photo;
    String text;
    List<MessageEntity> textEntities;
    Animation animation;
}
