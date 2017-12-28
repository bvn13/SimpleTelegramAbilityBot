package ru.bvn13.telebot;

import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;

import static org.telegram.abilitybots.api.objects.Locality.ALL;
import static org.telegram.abilitybots.api.objects.Privacy.PUBLIC;

/**
 * Created by bvn13 on 28.12.2017.
 */
public class TeleBot extends AbilityBot {

    public static String BOT_TOKEN = "your token";
    public static String BOT_USERNAME = "bot name";

    public TeleBot() {
        super(BOT_TOKEN, BOT_USERNAME);
    }

    protected TeleBot(String botToken, String botUsername) {
        super(botToken, botUsername);
    }

    @Override
    public int creatorId() {
        return 258985362;
    }

    public Ability sayHelloWorld() {
        return Ability
                .builder()
                .name("hello")
                .info("says hello world!")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> silent.send("Hello world!", ctx.chatId()))
                .build();
    }

}
