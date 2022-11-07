package midterm;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Person {
    private String name;
    private Integer age;
    private List<Pet> pets;
}
