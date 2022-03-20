package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;
// https://core.telegram.org/bots/api#invoice
@Data
public class Invoice {
    String title;
    String description;
    String startParameter;
    String currency;
    String totalAmount;
}
