package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#location
 */
@Data
public class Location {
    Float longitude;
    Float latitude;
    Float horizontalAccuracy;
    Integer livePeriod;
    Integer heading;
    Integer proximityAlertRadius;
}
