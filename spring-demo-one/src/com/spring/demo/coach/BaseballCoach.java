package com.spring.demo.coach;

import com.spring.demo.coach.Coach;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        return "";
    }
}
