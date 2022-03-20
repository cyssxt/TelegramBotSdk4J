package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

//https://core.telegram.org/bots/api#chatlocation
@Data
public class ChatLocation {
    Location location;
    String address;
}
