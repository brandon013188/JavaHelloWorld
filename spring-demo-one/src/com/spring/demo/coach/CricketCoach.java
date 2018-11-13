package com.spring.demo.coach;

import com.spring.demo.fortune_service.FortuneService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CricketCoach implements Coach {
    @NonNull
    private FortuneService fortuneService;
    @NonNull
    private String emailAddress;
    @NonNull
    private String team;

    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
