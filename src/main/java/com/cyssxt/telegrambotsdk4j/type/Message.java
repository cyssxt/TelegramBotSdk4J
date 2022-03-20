package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

import java.util.List;


/**
 * https://core.telegram.org/bots/api#message
 */
@Data
public class Message {
    Integer messageId;
    User from;
    Chat sendChat;
    Integer date;
    Chat chat;
    User forwardFrom;
    Chat forwardFromChat;
    Integer forwardFromMessageId;
    String forwardSignature;
    String forwardSenderName;
    Integer forwardDate;
    Boolean isAutomaticForward;
    Message replyToMessage;
    User viaBot;
    Integer editDate;
    Boolean hasProtectedContent;
    String mediaGroupId;
    String authorSignature;
    String text;
    List<MessageEntity> entities;
    Animation animation;
    Audio audio;
    Document document;
    List<PhotoSize> photo;
    Sticker sticker;
    Video video;
    VideoNote videoNote;
    Voice voice;
    String caption;
    List<MessageEntity> captionEntities;
    Contact contact;
    Dice dice;
    Game game;
    Poll poll;
    Venue venue;
    Location location;
    List<User> newChatMembers;
    User leftChatMember;
    String newChatTitle;
    List<PhotoSize> newChatPhoto;
    Boolean deleteChatPhoto;
    Boolean groupChatCreated;
    Boolean supergroupChatCreated;
    Boolean channelChatCreated;
    MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
    Integer migrateToChatId;
    Integer migrateFromChatId;
    Message pinnedMessage;
    Invoice invoice;
    SuccessfulPayment successfulPayment;
    String connectedWebsite;
    PassportData passportData;
    ProximityAlertTriggered proximityAlertTriggered;
    VoiceChatScheduled voiceChatScheduled;
    VoiceChatStarted voiceChatStarted;
    VoiceChatEnded voiceChatEnded;
    VoiceChatParticipantsInvited voiceChatParticipantsInvited;
    InlineKeyboardMarkup inlineKeyboardMarkup;
}
