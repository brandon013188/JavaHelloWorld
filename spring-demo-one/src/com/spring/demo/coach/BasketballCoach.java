package com.spring.demo.coach;

import com.spring.demo.coach.Coach;
import com.spring.demo.fortune_service.FortuneService;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BasketballCoach implements Coach {
    @NonNull
    private final FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice jump shoot for 2 hours";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
