package com.spring.demo;

import com.spring.demo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve the bean from spring container
        Coach theCoach_singleton = context.getBean("myCoach_singleton", Coach.class);
        Coach alphaCoach_singleton = context.getBean("myCoach_singleton", Coach.class);

        Coach theCoach_prototype = context.getBean("myCoach_prototype", Coach.class);
        Coach alphaCoach_prototype = context.getBean("myCoach_prototype", Coach.class);

        // check if they are the same
        // Note: == vs === vs equals()
        //       1. == is the operator that used for reference comparison. In other words, to check whether both of the
        //          objects are pointing to the same memory location.
        //       2. === is the operator that used for content comparison. In other words, to check whether both of the
        //          objects have the same value.
        //       3. equals() is the method that used for content comparison. Same as the === operator.
        boolean isSame_singleton = (theCoach_singleton == alphaCoach_singleton);
        boolean isSame_prototype = (theCoach_prototype == alphaCoach_prototype);

        // print the result
        System.out.println("Singleton bean results: ");
        System.out.println(String.format("\n Pointing to the same object: %s", isSame_singleton));

        // Note: The default implementation of the toString method of the object will give the class name and the internal memory address
        System.out.println(String.format("\n The memory location for theCoach: %s", theCoach_singleton));
        System.out.println(String.format("\n The memory location for alphaCoach: %s\n", alphaCoach_singleton));

        System.out.println("Prototype bean results: ");
        System.out.println(String.format("\n Pointing to the same object: %s", isSame_prototype));

        // Note: The default implementation of the toString method of the object will give the class name and the internal memory address
        System.out.println(String.format("\n The memory location for theCoach: %s", theCoach_prototype));
        System.out.println(String.format("\n The memory location for alphaCoach: %s\n", alphaCoach_prototype));

        // Close the context
        context.close();
    }
}
