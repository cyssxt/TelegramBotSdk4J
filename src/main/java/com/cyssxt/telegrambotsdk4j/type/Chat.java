package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#chat
 */
@Data
public class Chat {
    Integer id;
    String type;
    String title;
    String username;
    String firstName;
    String lastName;
    ChatPhoto chatPhoto;
    String bio;
    Boolean hasPrivateForwards;
    String description;
    String inviteLink;
    Message pinnedMessage;
    ChatPermissions permissions;
    Integer slowModeDelay;
    Integer messageAutoDeleteTime;
    Boolean hasProtectedContent;
    String stickerSetName;
    Boolean canSetStickerSet;
    Integer linkedChatId;
    ChatLocation location;
}
