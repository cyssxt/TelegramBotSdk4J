package com.cyssxt.telegrambotsdk4j.type;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;


/**
 * https://core.telegram.org/bots/api#message
 */
@Data
public class Message {
    @JSONField(name="message_id")
    Long messageId;
    User from;
    @JSONField(name="send_chat")
    Chat sendChat;
    Integer date;
    Chat chat;
    @JSONField(name="forward_from")
    User forwardFrom;
    @JSONField(name="forward_from_chat")
    Chat forwardFromChat;
    @JSONField(name="forward_from_message_id")
    Integer forwardFromMessageId;
    @JSONField(name="forward_signature")
    String forwardSignature;
    @JSONField(name="forward_sender_name")
    String forwardSenderName;
    @JSONField(name="forward_date")
    Integer forwardDate;
    @JSONField(name="is_automatic_forward")
    Boolean isAutomaticForward;
    @JSONField(name="reply_to_message")
    Message replyToMessage;
    @JSONField(name="via_bot")
    User viaBot;
    @JSONField(name="edit_date")
    Integer editDate;
    @JSONField(name="has_protected_content")
    Boolean hasProtectedContent;
    @JSONField(name="media_group_id")
    String mediaGroupId;
    @JSONField(name="author_signature")
    String authorSignature;
    String text;
    List<MessageEntity> entities;
    Animation animation;
    Audio audio;
    Document document;
    List<PhotoSize> photo;
    Sticker sticker;
    Video video;
    @JSONField(name="video_note")
    VideoNote videoNote;
    Voice voice;
    String caption;
    @JSONField(name="caption_entities")
    List<MessageEntity> captionEntities;
    Contact contact;
    Dice dice;
    Game game;
    Poll poll;
    Venue venue;
    Location location;
    @JSONField(name="new_chat_members")
    List<User> newChatMembers;
    @JSONField(name="left_chat_member")
    User leftChatMember;
    @JSONField(name="new_chat_title")
    String newChatTitle;
    @JSONField(name="new_chat_photo")
    List<PhotoSize> newChatPhoto;
    @JSONField(name="delete_chat_photo")
    Boolean deleteChatPhoto;
    @JSONField(name="group_chat_created")
    Boolean groupChatCreated;
    @JSONField(name="supergroup_chat_created")
    Boolean supergroupChatCreated;
    @JSONField(name="channel_chat_created")
    Boolean channelChatCreated;
    @JSONField(name="message_auto_delete_timer_changed")
    MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
    @JSONField(name="migrate_to_chat_id")
    Integer migrateToChatId;
    @JSONField(name="migrate_from_chat_id")
    Integer migrateFromChatId;
    @JSONField(name="pinned_message")
    Message pinnedMessage;
    Invoice invoice;
    @JSONField(name="successful_payment")
    SuccessfulPayment successfulPayment;
    @JSONField(name="connected_website")
    String connectedWebsite;
    @JSONField(name="passport_data")
    PassportData passportData;
    @JSONField(name="proximity_alert_triggered")
    ProximityAlertTriggered proximityAlertTriggered;
    @JSONField(name="voice_chat_scheduled")
    VoiceChatScheduled voiceChatScheduled;
    @JSONField(name="voice_chat_started")
    VoiceChatStarted voiceChatStarted;
    @JSONField(name="voice_chat_ended")
    VoiceChatEnded voiceChatEnded;
    @JSONField(name="voice_chat_participants_invited")
    VoiceChatParticipantsInvited voiceChatParticipantsInvited;
    @JSONField(name="reply_to_message")
    InlineKeyboardMarkup reply_markup;
}
