package midterm;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet {
    private String name;
    private Integer age;
    private String type;

}
