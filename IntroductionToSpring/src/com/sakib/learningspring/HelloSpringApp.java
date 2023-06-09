package com.sakib.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


//        // retrieve bean from spring container
//        Coach theCoach = context.getBean("myCoach", Coach.class);
//
//        // call methods on the bean
//        System.out.println(theCoach.getDailyWorkout());
//
//        System.out.println(theCoach.getDailyFortune());


        // Going through the CricketCoach class now
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam());


        // close the context
        context.close();
    }

}
