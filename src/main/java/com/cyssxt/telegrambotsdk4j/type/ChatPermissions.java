package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

//https://core.telegram.org/bots/api#chatpermissions
@Data
public class ChatPermissions {
    Boolean canSendMessages;
    Boolean canSendMediaMessages;
    Boolean canSendPolls;
    Boolean canSendOtherMessages;
    Boolean canAddWebPagePreviews;
    Boolean canChangeInfo;
    Boolean canInviteUsers;
    Boolean canPinMessages;
}
