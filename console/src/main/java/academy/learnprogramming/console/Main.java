package academy.learnprogramming.console;
import academy.learnprogramming.Game;
import academy.learnprogramming.GameImpl;
import academy.learnprogramming.NumberGenerator;
import academy.learnprogramming.NumberGeneratorImpl;
import academy.learnprogramming.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create context (container)
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        NumberGenerator numberGenerator = context.getBean(NumberGeneratorImpl.class);



    }
}