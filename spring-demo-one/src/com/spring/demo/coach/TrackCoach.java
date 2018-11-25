package com.spring.demo.coach;

import com.spring.demo.fortune_service.FortuneService;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
public class TrackCoach implements Coach {
    @NonNull
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("Track coach: inside the method doMyStartupStuff");
    }
    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("Track coach: inside the method doMyCleanupStuff");
    }
}
