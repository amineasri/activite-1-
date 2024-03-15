package pres;

import Metier.Imetier;
import org.springframework.core.annotation.AnnotationConfigurationException;

public class PreSpringannotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        Imetier metier =context.getBean(Imetier.class);
        System.out.println(metier.calcul());
    }
}
