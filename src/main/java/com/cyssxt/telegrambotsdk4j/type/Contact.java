package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#contact
 */
@Data
public class Contact {
    String phoneNumber;
    String firstName;
    String lastName;
    Integer userId;
    String vcard;
}
