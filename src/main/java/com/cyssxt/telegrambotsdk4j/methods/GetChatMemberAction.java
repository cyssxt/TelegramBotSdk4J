package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.GetChatMemberReq;
import com.cyssxt.telegrambotsdk4j.req.UpdateReq;
import com.cyssxt.telegrambotsdk4j.type.ChatMember;
import com.cyssxt.telegrambotsdk4j.type.Response;
import com.cyssxt.telegrambotsdk4j.type.WebhookInfo;

import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.GET_CHAT_MEMBER;
import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.GET_WEBHOOK_INFO;

public class GetChatMemberAction extends BaseAction<GetChatMemberReq, ChatMember> {

    @Override
    public String getMethod() {
        return GET_CHAT_MEMBER;
    }

    @Override
    public TypeReference<Response<ChatMember>> getTypeReference() {
        return new TypeReference<Response<ChatMember>>(){};
    }

    public static boolean isMemeber(Long userId,String chatId) {
        boolean flag= false;
        try{
            BaseAction<GetChatMemberReq, ChatMember> baseAction = ActionFactory.create(GetChatMemberAction.class);
            GetChatMemberReq t = new GetChatMemberReq();
            t.setUserId(userId);
            t.setChatId(chatId);
            Response<ChatMember> send = baseAction.send(t);
            if(send.isOk()){

            }
        }catch(Exception e){

        }
        return flag;

    }
}
