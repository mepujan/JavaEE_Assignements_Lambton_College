package midterm;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Business {
    private String name;
    private String address;
    private Person owner;
    private String postalCode;
    private List<Person> customers;

}
