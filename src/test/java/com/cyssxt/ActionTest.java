//package com.cyssxt;
//
//import com.cyssxt.telegrambotsdk4j.methods.*;
//import com.cyssxt.telegrambotsdk4j.req.DeleteWebhookReq;
//import com.cyssxt.telegrambotsdk4j.req.GetChatMemberReq;
//import com.cyssxt.telegrambotsdk4j.req.SendMessageReq;
//import com.cyssxt.telegrambotsdk4j.req.UpdateReq;
//import com.cyssxt.telegrambotsdk4j.type.*;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ActionTest {
//
//    @Test
//    public void setHook() throws InstantiationException, IllegalAccessException {
//        ActionFactory.init("5224551687:AAHJmhxy8mzbtVAGAUH7cJ-b3Ho8hcwHcus");
//        BaseAction<UpdateReq, List<MessageResult>> baseAction = ActionFactory.create(GetUpdatesAction.class);
//        UpdateReq req = new UpdateReq();
//        List<String> allows = new ArrayList<>();
//        allows.add("message");
//        req.setAllowedUpdates(allows);
//        Response<List<MessageResult>> send = baseAction.send(req);
//        System.out.println(send.getResult());
////        BaseAction<SetWebhookReq, String> baseAction = ActionFactory.create(SetWebhookAction.class);
////        SetWebhookReq setWebhookReq = new SetWebhookReq();
////        setWebhookReq.setUrl("http://localhost:8080/");
////        baseAction.send(setWebhookReq);
//    }
//
//    @Test
//    public void getWebhook() throws InstantiationException, IllegalAccessException {
//        ActionFactory.init("5224551687:AAHJmhxy8mzbtVAGAUH7cJ-b3Ho8hcwHcus");
//        BaseAction<UpdateReq, WebhookInfo> baseAction = ActionFactory.create(GetWebhookInfoAction.class);
//        UpdateReq req = new UpdateReq();
//        List<String> allows = new ArrayList<>();
//        allows.add("message");
//        req.setAllowedUpdates(allows);
//        Response<WebhookInfo> send = baseAction.send(req);
//        System.out.println(send.getResult());
////        BaseAction<SetWebhookReq, String> baseAction = ActionFactory.create(SetWebhookAction.class);
////        SetWebhookReq setWebhookReq = new SetWebhookReq();
////        setWebhookReq.setUrl("http://localhost:8080/");
////        baseAction.send(setWebhookReq);
//    }
//
//    @Test
//    public void setMessage() throws InstantiationException, IllegalAccessException {
//        ActionFactory.init("5224551687:AAHJmhxy8mzbtVAGAUH7cJ-b3Ho8hcwHcus");
//        BaseAction<SendMessageReq, Message> baseAction = ActionFactory.create(SendMessageAction.class);
//        SendMessageReq req = new SendMessageReq();
//        req.setText("[分享 + https://www.baidu.com]");
//        req.setChatId("5096724011");
//        Response<Message> send = baseAction.send(req);
//        System.out.println(send.getResult());
////        BaseAction<SetWebhookReq, String> baseAction = ActionFactory.create(SetWebhookAction.class);
////        SetWebhookReq setWebhookReq = new SetWebhookReq();
////        setWebhookReq.setUrl("http://localhost:8080/");
////        baseAction.send(setWebhookReq);
//    }
//
//    @Test
//    public void GetChatMemberAction() throws InstantiationException, IllegalAccessException {
//        ActionFactory.init("5224551687:AAHJmhxy8mzbtVAGAUH7cJ-b3Ho8hcwHcus");
//        BaseAction<GetChatMemberReq, ChatMember> baseAction = ActionFactory.create(GetChatMemberAction.class);
//        GetChatMemberReq req = new GetChatMemberReq();
//        req.setChatId("-625076710");
//        req.setUserId(5096724010L);
//        Response<ChatMember> send = baseAction.send(req);
//        System.out.println(send.getResult());
////        BaseAction<SetWebhookReq, String> baseAction = ActionFactory.create(SetWebhookAction.class);
////        SetWebhookReq setWebhookReq = new SetWebhookReq();
////        setWebhookReq.setUrl("http://localhost:8080/");
////        baseAction.send(setWebhookReq);
//    }
//
//    @Test
//    public void getUpdates() throws InstantiationException, IllegalAccessException {
//        ActionFactory.init("5224551687:AAHJmhxy8mzbtVAGAUH7cJ-b3Ho8hcwHcus");
//        BaseAction<UpdateReq, List<MessageResult>> baseAction = ActionFactory.create(GetUpdatesAction.class);
//        UpdateReq req = new UpdateReq();
//        Response<List<MessageResult>> send = baseAction.send(req);
//        System.out.println(send.getResult());
////        BaseAction<SetWebhookReq, String> baseAction = ActionFactory.create(SetWebhookAction.class);
////        SetWebhookReq setWebhookReq = new SetWebhookReq();
////        setWebhookReq.setUrl("http://localhost:8080/");
////        baseAction.send(setWebhookReq);
//    }
//
//    @Test
//    public void deleteWebhook() throws InstantiationException, IllegalAccessException {
//        ActionFactory.init("5224551687:AAHJmhxy8mzbtVAGAUH7cJ-b3Ho8hcwHcus");
//        BaseAction<DeleteWebhookReq, Boolean> baseAction = ActionFactory.create(DeleteWebhookAction.class);
//        DeleteWebhookReq req = new DeleteWebhookReq();
//        req.setDropPendingUpdates(true);
//        Response<Boolean> send = baseAction.send(req);
//        System.out.println(send.getResult());
////        BaseAction<SetWebhookReq, String> baseAction = ActionFactory.create(SetWebhookAction.class);
////        SetWebhookReq setWebhookReq = new SetWebhookReq();
////        setWebhookReq.setUrl("http://localhost:8080/");
////        baseAction.send(setWebhookReq);
//    }
//}
