package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

import java.util.List;

//https://core.telegram.org/bots/api#passportdata
@Data
public class PassportData {
    List<EncryptedPassportElement> data;
    EncryptedCredentials credentials;
}
