package com.spring.demo.fortune_service;

import lombok.NoArgsConstructor;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
    private static final String[] FORTUNE_MESSAGES =
            new String[] {"You are on the best day of your life!", "Happiness is on its way to you!", "Treat yourself a good luck!"};

    @Override
    public String getFortune() {
        Random random = new Random();
        int randomIndex = random.nextInt(3);

        return FORTUNE_MESSAGES[randomIndex];
    }
}
