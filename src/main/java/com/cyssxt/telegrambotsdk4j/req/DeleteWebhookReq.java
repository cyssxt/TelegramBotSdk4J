package com.cyssxt.telegrambotsdk4j.req;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteWebhookReq {
    @JSONField(name="drop_pending_updates")
    Boolean dropPendingUpdates;
}
