package org.campus;


import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static final String BOT_TOKEN = "6404179236:AAG72TxPy-e0ySo3G3PoKqI5N5qRwgDxQLM";
    public static LogService logService = new LogService();
    public static Map<Long, TGUser> users = new HashMap<>();




    public static void main(String[] args) {
        System.out.println("Hello world!");

        TelegramBot telegramBot = new TelegramBot(BOT_TOKEN);
        telegramBot.setUpdatesListener(new UpdatesListener() {
            @Override
            public int process(List<Update> list){
                for (Update update: list){
                    logService.log(update);
                    SendMessage sendMessage = new SendMessage(update.message().from().id(), "Privetiki pistoletiki, etot goroskop dlya Aliny Kosyuk:" +

                            "  10 февраля — Если хорошие новости существуют, то они будут уже сегодня!");
                    telegramBot.execute(sendMessage);
                }
                return UpdatesListener.CONFIRMED_UPDATES_ALL;
            }
        });
    }
}