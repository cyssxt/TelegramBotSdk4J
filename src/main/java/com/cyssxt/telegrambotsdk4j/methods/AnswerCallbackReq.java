package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AnswerCallbackReq {
    @JSONField(name="callback_query_id")
    String callbackQueryId;
    String text;
    @JSONField(name="show_alert")
    Boolean showAlert;
    Boolean url;
    @JSONField(name = "cache_time")
    Boolean cacheTime;
}
