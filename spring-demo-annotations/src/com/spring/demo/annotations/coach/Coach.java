package com.spring.demo.annotations.coach;

/**
 * Coach interface.
 *
 * @author liguanch
 *
 */
public interface Coach {

    /**
     * Get the daily workout activity message.
     *
     * @return the message for the daily workout activity.
     */
    // Note: public access modifier is not needed as it is default for interface class.
    String getDailyWorkout();

    /**
     * Get the daily fortune message.
     *
     * @return the message for the daily fortune.
     */
    String getDailyFortune();
}
