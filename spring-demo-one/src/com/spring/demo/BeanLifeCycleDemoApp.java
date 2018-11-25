package com.spring.demo;

import com.spring.demo.coach.Coach;
import com.spring.demo.coach.TrackCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve the beans from spring container
        Coach theCoach = context.getBean("myCoach", TrackCoach.class);

        // do sth with the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
