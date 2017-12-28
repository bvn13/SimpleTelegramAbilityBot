package ru.bvn13.telebot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by bvn13 on 28.12.2017.
 */
public class Application {

    public static void main(String[] args) {
        // Initializes dependencies necessary for the base bot - Guice
        ApiContextInitializer.init();

        // Create the TelegramBotsApi object to register your bots
        TelegramBotsApi botsApi = new TelegramBotsApi();

        try {
            // Register your newly created AbilityBot
            botsApi.registerBot(new TeleBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
