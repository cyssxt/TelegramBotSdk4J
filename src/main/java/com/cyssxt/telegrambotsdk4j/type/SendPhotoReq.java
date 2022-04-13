package com.cyssxt.telegrambotsdk4j.type;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SendPhotoReq {

    @JSONField(name="chat_id")
    Object chatId;
    String photo;
    String caption;
}
