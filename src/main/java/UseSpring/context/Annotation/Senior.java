package UseSpring.context.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("Ilia")
public class Senior {
    private String name = "Ilia";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
