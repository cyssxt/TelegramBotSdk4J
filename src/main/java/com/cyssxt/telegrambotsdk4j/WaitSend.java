package com.cyssxt.telegrambotsdk4j;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class WaitSend {
    String key;
    String message;
    List<Map<String,String>> hrefs;
}
