package com.spring.demo.annotations.fortuneservice;

import org.springframework.stereotype.Component;

/**
 * HappyFortuneService implementation for FortuneService interface.
 *
 * @author liguanch
 *
 */
@Component
public class HappyFortuneService implements FortuneService {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
