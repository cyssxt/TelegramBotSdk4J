package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;
//https://core.telegram.org/bots/api#venue
@Data
public class Venue {
    Location location;
    String title;
    String address;
    String foursquareId;
    String foursquareType;
    String googlePlaceId;
    String googlePlaceType;
}
