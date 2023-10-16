package UseSpring.context.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Middle {
    private String name = "Pitr";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
