package com.cyssxt.telegrambotsdk4j.req;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetChatMemberReq {
    @JSONField(name="chat_id")
    Object chatId;
    @JSONField(name="user_id")
    Long userId;
}
