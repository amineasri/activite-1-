package pres;

import Metier.Imetier;
import org.springframework.core.metrics.ApplicationStartup;

import java.applet.AppletContext;

public class PreSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfix.xml");
        Imetier metier = (Imetier) context.getBean("metier");
    }
}
