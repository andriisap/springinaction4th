package soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerMain {
    public static void main(String[] args) throws Exception {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/soundsystem.xml");
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        context.close();
    }
}
