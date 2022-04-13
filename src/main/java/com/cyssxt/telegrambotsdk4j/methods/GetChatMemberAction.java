package com.cyssxt.telegrambotsdk4j.methods;

import com.alibaba.fastjson.TypeReference;
import com.cyssxt.telegrambotsdk4j.req.GetChatMemberReq;
import com.cyssxt.telegrambotsdk4j.type.ChatMember;
import com.cyssxt.telegrambotsdk4j.type.Response;
import lombok.extern.slf4j.Slf4j;

import static com.cyssxt.telegrambotsdk4j.constant.ApiConstant.GET_CHAT_MEMBER;

@Slf4j
public class GetChatMemberAction extends BaseAction<GetChatMemberReq, ChatMember> {

    @Override
    public String getMethod() {
        return GET_CHAT_MEMBER;
    }

    @Override
    public TypeReference<Response<ChatMember>> getTypeReference() {
        return new TypeReference<Response<ChatMember>>(){};
    }

    public static boolean isMemeber(ActionFactory actionFactory,Long userId,String chatId) {
        boolean flag= false;
        try{
            BaseAction<GetChatMemberReq, ChatMember> baseAction = actionFactory.create(GetChatMemberAction.class);
            GetChatMemberReq t = new GetChatMemberReq();
            t.setUserId(userId);
            t.setChatId(chatId);
            Response<ChatMember> send = baseAction.send(t);
            if(send.isOk()){
                ChatMember member= send.getResult();
                String status = member.getStatus();//creator,administrator,member
                flag = "creator,administrator,member,".contains(status);
            }
        }catch(Exception e){
            log.info("isMemeber={}",flag);
        }
        return flag;

    }
}
