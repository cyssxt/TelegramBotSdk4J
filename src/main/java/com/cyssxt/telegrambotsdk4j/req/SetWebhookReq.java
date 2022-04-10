package com.cyssxt.telegrambotsdk4j.req;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import java.io.File;
import java.util.List;

@Data
public class SetWebhookReq {
    String url;
    File certificate;
    @JSONField(name="ip_address")
    String ipAddress;
    @JSONField(name="max_connections")
    Integer maxConnections;
    @JSONField(name="allowed_updates")
    List<String> allowedUpdates;
    @JSONField(name="drop_pending_updates")
    Boolean dropPendingUpdates;
}
