package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;
//https://core.telegram.org/bots/api#proximityalerttriggered
@Data
public class ProximityAlertTriggered {
    User traveler;
    User watcher;
    Integer distance;
}
