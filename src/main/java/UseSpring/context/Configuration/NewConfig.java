package UseSpring.context.Configuration;

import UseSpring.context.Annotation.Junior;
import UseSpring.context.Annotation.Middle;
import UseSpring.context.Configuration.week.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("UseSpring.context.Annotation")
public class NewConfig {
    @Bean("Jun")
    public Junior getJun() {
        return new Junior();
    }
    @Bean("Mid")
    public Middle getCat(Junior Jun) {
        Middle mid = new Middle();
        mid.setName(Jun.getName() + " +1 year = middle");
        return mid;
    }

    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();
        }
    }
}
