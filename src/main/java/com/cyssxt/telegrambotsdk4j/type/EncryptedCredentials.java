package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

// https://core.telegram.org/bots/api#encryptedcredentials
@Data
public class EncryptedCredentials {
    String data;
    String hash;
    String secret;
}
