package com.cyssxt.telegrambotsdk4j;

import com.cyssxt.telegrambotsdk4j.methods.ActionFactory;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class BotRegister {

    private final static Queue<WaitSend> WAIT_SEND = new LinkedList();

    private final static ExecutorService executorService = Executors.newFixedThreadPool(5);

    public static boolean register(BotInfo botInfo){
        return ActionFactory.init(botInfo);
    }
    public static void addWaitSend(WaitSend waitSend){
        WAIT_SEND.add(waitSend);
    }
    public static void addWaitSend(String key,String message){
        addWaitSend(WaitSend.builder().key(key).message(message).build());
    }

    public static void init(){
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                while (true){
                    WaitSend poll;
                    log.info("init={}", LocalDateTime.now());
                    while ((poll= WAIT_SEND.poll())!=null){
                        log.info("init={}",poll);
                        try {
                            ActionFactory.quickSend(poll.getKey(), poll.getMessage(),poll.getHrefs());
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    Thread.sleep(5*1000);
                }
            });
        }
    }

    public static void addWaitSend(String key, String message, List<Map<String, String>> hrefs) {
        addWaitSend(WaitSend.builder().key(key).message(message).hrefs(hrefs).build());
    }
}
