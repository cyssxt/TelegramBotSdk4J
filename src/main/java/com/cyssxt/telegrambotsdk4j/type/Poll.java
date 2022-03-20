package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

import java.util.List;

//https://core.telegram.org/bots/api#poll
@Data
public class Poll {
    String id;
    String question;
    List<PollOption> options;
    Integer totalVoterCount;
    Boolean isClosed;
    Boolean isAnonymous;
    String type;
    Boolean allowsMultipleAnswers;
    Integer correctOptionId;
    String explanation;
    List<MessageEntity> explanationEntities;
    Integer openPeriod;
    Integer closeDate;
}
