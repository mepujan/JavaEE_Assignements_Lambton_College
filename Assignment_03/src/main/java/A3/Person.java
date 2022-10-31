package A3;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonProperty;
@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Person {
   private final String id;
   private final String firstName;
   private final String lastName;
   private final Integer age;
   private final String gender;

   @Jacksonized
   @Builder
   private static Person of(
          @JsonProperty("id") String id,
          @JsonProperty("firstName") String firstName,
           @JsonProperty("lastName") String lastName,
           @JsonProperty("age") Integer age,
          @JsonProperty("gender") String gender){
      if(id == null){
         throw new RuntimeException("Id Cannot Be Null.");
      }
      if("".equals(firstName) || firstName == null){
         throw new RuntimeException("Firstname cannot be null or empty.");
      }
      if("".equals(lastName) || lastName == null){
         throw new RuntimeException("Lastname cannot be null or empty.");
      }
      if(age < 0 )
      {
         throw new RuntimeException("Age Should be greater than oe equals to  zero.");
      }
      return new Person(id,firstName,lastName,age,gender);
   }
}
