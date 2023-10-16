package UseSpring.context.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
import org.springframework.context.support.ClassPathXmlApplicationContext;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml"
        ); это если используем ApplicationContext.xml
*/
public class Main {
    public static void main(String[] args) {
// создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
       ApplicationContext context = new AnnotationConfigApplicationContext("UseSpring.context.Annotation");
        Junior Ivan = context.getBean(Junior.class);
        Middle Pitr = (Middle) context.getBean("middle");
        Senior Ilia = context.getBean("Ilia", Senior.class);

        System.out.println(Ivan.getName());
        System.out.println(Pitr.getName());
        System.out.println(Ilia.getName());
        Ivan.printName();
    }

}
