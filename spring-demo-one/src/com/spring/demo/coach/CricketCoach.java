package com.spring.demo.coach;

import com.spring.demo.fortune_service.FortuneService;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

@NoArgsConstructor
public class CricketCoach implements Coach {
    @NonNull
    @Setter
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
