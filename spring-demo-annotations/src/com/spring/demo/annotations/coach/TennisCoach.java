package com.spring.demo.annotations.coach;

import com.spring.demo.annotations.fortuneservice.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TennisCoach implementation for Coach interface.
 *
 * @author liguanch
 *
 */
//@Component("thatSillyCoach") // bean id: thatSillyCoach
// Note: Default bean id: the classname with the first letter lower-case.
@Component // bean id: tennisCoach
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    // Constructor injection with Autowired annotation
    @Autowired
    public TennisCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
