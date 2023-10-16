package UseSpring.context.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Junior {
    private String name = "Ivan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void  printName() {
        System.out.println(this.name);
    }

}
