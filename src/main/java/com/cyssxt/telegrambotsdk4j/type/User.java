package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#user
 */
@Data
public class User {
    Long id;
    Boolean isBot;
    String firstName;
    String lastName;
    String username;
    String languageCode;
    Boolean canJoinGroups;
    Boolean canReadAllGroupMessages;
    Boolean supportsInlineQueries;
}
