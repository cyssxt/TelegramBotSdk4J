package com.cyssxt.telegrambotsdk4j.type;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class KeyboardButton {
    String text;
    @JSONField(name="request_contact")
    Boolean requestContact;
    @JSONField(name="request_location")
    Boolean requestLocation;
    @JSONField(name="request_poll")
    KeyboardButtonPollType requestPoll;
}
