package com.cyssxt.telegrambotsdk4j.req;

import com.alibaba.fastjson.annotation.JSONField;
import com.cyssxt.telegrambotsdk4j.type.MessageEntity;
import lombok.Data;

import java.util.List;

@Data
public class SendMessageReq {
    @JSONField(name="chat_id")
    Object chatId;
    String text;
    @JSONField(name="message_id")
    Long messageId;
    @JSONField(name="inline_message_id")
    String inlineMessageId;
    @JSONField(name="parse_mode")
    String parseMode;//MarkdownV2
    List<MessageEntity> entities;
    @JSONField(name="disable_web_page_preview")
    Boolean disableWebPagePreview;
    @JSONField(name="disable_notification")
    Boolean disableNotification;
    @JSONField(name="protect_content")
    Boolean protectContent;
    @JSONField(name="reply_to_message_id")
    Long replyToMessageId;
    @JSONField(name="reply_markup")
    Object replyMarkup;
}
