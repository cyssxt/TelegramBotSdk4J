package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#orderinfo
 */
@Data
public class OrderInfo {
    String name;
    String phoneNumber;
    String email;
    ShippingAddress shippingAddress;
}
