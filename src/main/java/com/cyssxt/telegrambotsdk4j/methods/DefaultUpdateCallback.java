package com.cyssxt.telegrambotsdk4j.methods;

import com.cyssxt.telegrambotsdk4j.req.SendMessageReq;
import com.cyssxt.telegrambotsdk4j.type.*;
import java.util.ArrayList;
import java.util.List;

public class DefaultUpdateCallback implements UpdateCallback {


    @Override
    public void receive(MessageResult result) throws InstantiationException, IllegalAccessException {
        System.out.println(result.getCallbackQuery());
        Message message = result.getMessage();
        if (result.getCallbackQuery() != null) {
            CallbackQuery callbackQuery = result.getCallbackQuery();
            Long id = callbackQuery.getFrom().getId();
            Long chatId = callbackQuery.getMessage().getChat().getId();
            String data = callbackQuery.getData();
            Long messageId = callbackQuery.getMessage().getMessageId();
            if("startTask".equals(data)) {
                BaseAction<AnswerCallbackReq, Boolean> baseAction = ActionFactory.create(AnswerCallbackQueryAction.class);
                AnswerCallbackReq t = new AnswerCallbackReq();
                t.setCallbackQueryId(result.getCallbackQuery().getId());
                t.setShowAlert(false);
                baseAction.send(t);
                InlineKeyboardButton keybord1 = new InlineKeyboardButton();
                keybord1.setUrl("https://t.me/");
                keybord1.setText("\uD83D\uDD18JOIN");

                InlineKeyboardButton keybord2 = new InlineKeyboardButton();
                keybord2.setCallbackData("joinDone");
                keybord2.setText("DONE");

                EditMessageTextAction.editMessage(messageId,chatId,"Join telegram channel and click \"DONE\"",keybord1,keybord2);
//                BaseAction<SendMessageReq, Message> editAction = ActionFactory.create(EditMessageTextAction.class);
//                SendMessageReq editReq = new SendMessageReq();
////            editReq.setChatId(result.getCallbackQuery().getChatInstance());
//                editReq.setText("Join telegram channel and click \"DONE\"");
//                editReq.setMessageId(messageId);
//                editReq.setChatId(chatId);
//                InlineKeyboardMarkup btns = new InlineKeyboardMarkup();
//                List<List<InlineKeyboardButton>> rows = new ArrayList<>();
//                List<InlineKeyboardButton> keybord = new ArrayList<>();
//                InlineKeyboardButton keybord1 = new InlineKeyboardButton();
//                keybord1.setUrl("https://t.me/DiemAirdrop");
//                keybord1.setText("\uD83D\uDD18JOIN");
//                keybord.add(keybord1);
//                rows.add(keybord);
//                List<InlineKeyboardButton> keybord2 = new ArrayList<>();
//                InlineKeyboardButton keybord21 = new InlineKeyboardButton();
//                keybord21.setCallbackData("joinDone");
//                keybord21.setText("DONE");
//                keybord2.add(keybord21);
//                rows.add(keybord2);
//                btns.setInlineKeyboard(rows);
//                editReq.setReplyMarkup(btns);
//                editAction.send(editReq);
            }
            else if("joinDone".equals(data)){
                boolean memeber = GetChatMemberAction.isMemeber(id, "@DiemAirdrop");
                String reply = "\uD83D\uDCE5 Submit your gmail address\n";
                if(!memeber){
                    reply = "--- You haven’t join yet ❌\n" +
                            "Join telegram channel and \n" +
                            "click \"Check✅\" button after join";
                }
                BaseAction<SendMessageReq, Message> sendAction = ActionFactory.create(EditMessageTextAction.class);
                SendMessageReq sendMessageReq = new SendMessageReq();
                sendMessageReq.setText(reply);
                sendMessageReq.setMessageId(messageId);
                sendMessageReq.setChatId(chatId);
                if(!memeber) {
                    InlineKeyboardMarkup btns = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> rows = new ArrayList<>();
                    List<InlineKeyboardButton> keybord = new ArrayList<>();
                    InlineKeyboardButton e = new InlineKeyboardButton();
//        e.getCallbackData();
                    e.setText("\uD83E\uDD16Check✅");
                    e.setCallbackData("joinDone");
//        e.setUrl("https://www.baidu.com");
                    keybord.add(e);
                    rows.add(keybord);
                    btns.setInlineKeyboard(rows);
                    sendMessageReq.setReplyMarkup(btns);
                }
                sendAction.send(sendMessageReq);
            }
        } else {
            if (message != null) {
                String text = message.getText();
                if("/start".equals(text)) {
                    SendMessageAction.sendMessage("Hello, arrow I am your friendly Binance Airdrop Merkezi bot\n" +
                                    "\n" +
                                    "✅Please do the required tasks to be eligible to get airdrop tokens.\n" +
                                    "\n" +
                                    "\uD83D\uDCB2Total rewards : 50,000$ USDT\n" +
                                    "\uD83D\uDD3810$ USDT each for 4000 random participants \n" +
                                    "⭐100$ USDT each for top 100 referrals \n" +
                                    "\n" +
                                    "\uD83D\uDCD8By Participating you are agreeing to the Binance Airdrop Merkezi (Airdrop) Program Terms and Conditions. Please see pinned post for more information.”\n" +
                                    "\n" +
                                    "Click \"Start Task\" to proceed\"",message.getChat().getId(),
                            new String[]{
                                    "\uD83E\uDD16Start Task","startTask"
                            });
//                    BaseAction<SendMessageReq, Message> baseAction = ActionFactory.create(SendMessageAction.class);
//                    SendMessageReq t = new SendMessageReq();
//                    t.setChatId(message.getChat().getId());
//                    t.setText();
//                    InlineKeyboardMarkup btns = new InlineKeyboardMarkup();
//                    List<List<InlineKeyboardButton>> rows = new ArrayList<>();
//                    List<InlineKeyboardButton> keybord = new ArrayList<>();
//                    InlineKeyboardButton e = new InlineKeyboardButton();
////        e.getCallbackData();
//                    e.setText("\uD83E\uDD16Start Task");
//                    e.setCallbackData("startTask");
////        e.setUrl("https://www.baidu.com");
//                    keybord.add(e);
//                    rows.add(keybord);
//                    btns.setInlineKeyboard(rows);
//                    t.setReplyMarkup(btns);
//                    baseAction.send(t);
                }
            }
        }
    }
}
