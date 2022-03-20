package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

//https://core.telegram.org/bots/api#shippingaddress
@Data
public class ShippingAddress {
    String countryCode;
    String state;
    String city;
    String streetLine1;
    String streetLine2;
    String postCode;
}
