package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

@Data
public class ChatMember {
//    status	String	The member's status in the chat, always “member”
//    user	User	Information about the user
    String status;
    User user;
}
