package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

import java.util.List;
//https://core.telegram.org/bots/api#voicechatparticipantsinvited
@Data
public class VoiceChatParticipantsInvited {

    List<User> users;
}
