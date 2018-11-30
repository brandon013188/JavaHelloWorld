package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

/**
 * TennisCoach implementation for Coach interface.
 *
 * @author liguanch
 *
 */
@Component("thatSillyCoach") // bean id: thatSillyCoach
public class TennisCoach implements Coach {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
