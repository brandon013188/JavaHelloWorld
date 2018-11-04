package com.spring.demo;

import com.spring.demo.coach.Coach;
import com.spring.demo.coach.TrackCoach;

public class MyApp {
    public static void main(String[] args) {
        // create the object
        Coach coach = new TrackCoach();

        // use the object
        System.out.println(coach.getDailyWorkout());

    }
}
