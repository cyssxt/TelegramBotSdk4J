package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

import java.util.List;

//https://core.telegram.org/bots/api#encryptedpassportelement
@Data
public class EncryptedPassportElement {
    String type;
    String data;
    String phoneNumber;
    String email;
    List<PassportFile> files;
    PassportFile frontSide;
    PassportFile reverseSide;
    PassportFile selfie;
    List<PassportFile> translation;
    String hash;
}
