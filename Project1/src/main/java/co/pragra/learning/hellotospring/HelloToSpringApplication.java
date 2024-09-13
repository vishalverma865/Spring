package co.pragra.learning.hellotospring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication

public class HelloToSpringApplication {
@Value("${apiKey}")
static String apiKey;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BMWM3 m3 = context.getBean("object1",BMWM3 .class);
        BMWM3 m4 = context.getBean("object2",BMWM3 .class);

        System.out.println(m3.getCarName() + " " +  m4.getEngine()  );
        System.out.println(m4.getCarName() + " " +  m4.getEngine()  );
        System.out.println(m3.getCarName() + " " +  m3.getEngine() + " " + m3.getFeatures() + " " + m3.getModelPricing());

        SpringApplication.run(HelloToSpringApplication.class, args);
    }

}
