package com.cyssxt.telegrambotsdk4j;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WaitSend {
    String key;
    String message;
}
