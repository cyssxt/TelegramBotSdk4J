package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.SendMessageReq;
import com.cyssxt.telegrambotsdk4j.type.InlineKeyboardButton;
import com.cyssxt.telegrambotsdk4j.type.InlineKeyboardMarkup;
import com.cyssxt.telegrambotsdk4j.type.Message;
import com.cyssxt.telegrambotsdk4j.type.Response;

import java.util.ArrayList;
import java.util.List;

public class EditMessageTextAction extends BaseAction<SendMessageReq, Message> {

    @Override
    public String getMethod() {
        return "editMessageText";
    }

    @Override
    public TypeReference<Response<Message>> getTypeReference() {
        return new TypeReference<Response<Message>>(){};
    }

    public static void editMessage(Long messageId,Long chatId,String text,InlineKeyboardButton ...buttons) throws InstantiationException, IllegalAccessException {
        BaseAction<SendMessageReq, Message> editAction = ActionFactory.create(EditMessageTextAction.class);
        SendMessageReq editReq = new SendMessageReq();
//            editReq.setChatId(result.getCallbackQuery().getChatInstance());
        editReq.setText(text);
        editReq.setMessageId(messageId);
        editReq.setChatId(chatId);
        InlineKeyboardMarkup btns = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        for(InlineKeyboardButton button:buttons) {
            List<InlineKeyboardButton> keybord = new ArrayList<>();
            keybord.add(button);
            rows.add(keybord);
        }
//        List<InlineKeyboardButton> keybord2 = new ArrayList<>();
//        InlineKeyboardButton keybord21 = new InlineKeyboardButton();
//        keybord21.setCallbackData("joinDone");
//        keybord21.setText("DONE");
//        keybord2.add(keybord21);
//        rows.add(keybord2);
        btns.setInlineKeyboard(rows);
        editReq.setReplyMarkup(btns);
        editAction.send(editReq);
    }
}
