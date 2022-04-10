package com.cyssxt.telegrambotsdk4j.methods;

import com.cyssxt.telegrambotsdk4j.type.Message;
import com.cyssxt.telegrambotsdk4j.type.Response;

public interface ReceiveMessageAction {

    Response receive(Message message);
}
