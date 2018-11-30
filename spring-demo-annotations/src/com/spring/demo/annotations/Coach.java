package com.spring.demo.annotations;

/**
 * Coach interface.
 *
 * @author liguanch
 *
 */
public interface Coach {

    /**
     * Get the daily workout activity.
     *
     * @return the message for the daily workout activity.
     */
    // Note: public access modifier is not needed as it is default for interface class.
    String getDailyWorkout();
}
