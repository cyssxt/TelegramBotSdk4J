package com.cyssxt;

import com.cyssxt.telegrambotsdk4j.methods.ActionFactory;
import com.cyssxt.telegrambotsdk4j.methods.BaseAction;
import com.cyssxt.telegrambotsdk4j.methods.GetUpdatesAction;
import com.cyssxt.telegrambotsdk4j.req.UpdateReq;
import com.cyssxt.telegrambotsdk4j.type.MessageResult;
import com.cyssxt.telegrambotsdk4j.type.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ActionTest {

    @Test
    public void setHook() throws InstantiationException, IllegalAccessException {
        ActionFactory.init("5224551687:AAHJmhxy8mzbtVAGAUH7cJ-b3Ho8hcwHcus");
        BaseAction<UpdateReq, MessageResult> baseAction = ActionFactory.create(GetUpdatesAction.class);
        UpdateReq req = new UpdateReq();
        List<String> allows = new ArrayList<>();
        allows.add("message");
        req.setAllowedUpdates(allows);
        Response<MessageResult> send = baseAction.send(req);
        System.out.println(send.getResult());
//        BaseAction<SetWebhookReq, String> baseAction = ActionFactory.create(SetWebhookAction.class);
//        SetWebhookReq setWebhookReq = new SetWebhookReq();
//        setWebhookReq.setUrl("http://localhost:8080/");
//        baseAction.send(setWebhookReq);
    }
}
