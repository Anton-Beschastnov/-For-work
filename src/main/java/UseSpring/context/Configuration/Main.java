package UseSpring.context.Configuration;

import UseSpring.context.Annotation.Junior;
import UseSpring.context.Annotation.Middle;
import UseSpring.context.Annotation.Senior;
import UseSpring.context.Configuration.week.WeekDay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(NewConfig.class);
        Junior Ivan = context.getBean("Jun", Junior.class);
        Middle Ivan1 = context.getBean("Mid", Middle.class);
        Senior seny = context.getBean(Senior.class);
        System.out.println(Ivan.getName());
        System.out.println(Ivan1.getName());
        System.out.println(seny.getName());
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
    }
}
