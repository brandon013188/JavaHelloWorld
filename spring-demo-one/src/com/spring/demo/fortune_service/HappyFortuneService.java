package com.spring.demo.fortune_service;

import com.spring.demo.fortune_service.FortuneService;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
