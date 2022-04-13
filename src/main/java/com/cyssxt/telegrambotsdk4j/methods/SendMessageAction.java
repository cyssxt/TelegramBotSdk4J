package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.SendMessageReq;
import com.cyssxt.telegrambotsdk4j.type.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SendMessageAction extends BaseAction<SendMessageReq, Message> {

    @Override
    public String getMethod() {
        return "sendMessage";
    }

    @Override
    public TypeReference<Response<Message>> getTypeReference() {
        return new TypeReference<Response<Message>>(){};
    }
    public static void sendMessage(ActionFactory actionFactory,String text,Long chatId,String[]...args) throws InstantiationException, IllegalAccessException {
        sendMessage(actionFactory,text,chatId,null,args);
    }
    public static void sendMessage(ActionFactory actionFactory,String text,Long chatId,List<MessageEntity> entities,String[]...args) throws InstantiationException, IllegalAccessException {
        BaseAction<SendMessageReq, Message> baseAction = actionFactory.create(SendMessageAction.class);
        SendMessageReq t = new SendMessageReq();
        t.setChatId(chatId);
        t.setText(text);
        if(args.length>0) {
            InlineKeyboardMarkup btns = new InlineKeyboardMarkup();
            List<List<InlineKeyboardButton>> rows = new ArrayList<>();
            List<InlineKeyboardButton> keybord = new ArrayList<>();
            InlineKeyboardButton e = new InlineKeyboardButton();
            for (int i = 0; i < args.length; i++) {
                String[] arg = args[i];
                String topic = arg[0];
                if (arg.length > 1) {
                    topic = arg[1];
                }
                e.setText(arg[0]);
                e.setCallbackData(topic);
            }
            keybord.add(e);
            rows.add(keybord);
            btns.setInlineKeyboard(rows);
            t.setReplyMarkup(btns);
        }
        t.setEntities(entities);
        baseAction.send(t);
    }
    public static void sendReplyMessage(ActionFactory actionFactory,String text,Long chatId,String ...args) throws InstantiationException, IllegalAccessException {
        BaseAction<SendMessageReq, Message> baseAction = actionFactory.create(SendMessageAction.class);
        SendMessageReq t = new SendMessageReq();
        t.setChatId(chatId);
        t.setText(text);
        if(args.length>0) {
            ReplyKeyboardMarkup btns = new ReplyKeyboardMarkup();
            btns.setOneTimeKeyboard(false);
            btns.setResizeKeyboard(true);
            List<List<KeyboardButton>> rows = new ArrayList<>();
            for (int i = 0; i < args.length; i++) {
                List<KeyboardButton> keybord = new ArrayList<>();
                KeyboardButton e = new KeyboardButton();
                String arg = args[i];
                e.setText(arg);
                keybord.add(e);
                rows.add(keybord);
            }
            btns.setKeyboard(rows);
            log.info("rows={}",rows);
            t.setReplyMarkup(btns);
        }
        baseAction.send(t);
    }
}
