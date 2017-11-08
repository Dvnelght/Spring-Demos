package udemy.spring.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read Spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from the Spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // call our new methods ... has the property values injected
        System.out.println("email: " + theCoach.getEmail());

        System.out.println("team: " + theCoach.getTeam());

        // close the context
        context.close();
    }
}
