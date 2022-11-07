/**
 * Pujan Gautam - c0842623
 * Mid-Term
 * Date of Submission: 11/5/2022
 */


package midterm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        final Pet pet1 = Pet.builder().name("Mew Mew").age(3).type("Persian").build();
         final Pet pet2 = Pet.builder().name("Kitty").age(5).type("Ragdoll").build();
         final Pet pet3 = Pet.builder().name("Daisy").age(6).type("Sphynx").build();
         final Person person1 = Person.builder().name("Pujan").age(25)
                .pets(new ArrayList<Pet>(){{add(pet1);}}).build();
         final Person person2 = Person.builder().name("Sujan").age(19)
                .pets(new ArrayList<Pet>(){{add(pet2);add(pet1);}}).build();

         final Person person3 = Person.builder().name("Happy").age(21)
                .pets(new ArrayList<Pet>(){{add(pet3);}}).build();

         final Business business1 = Business.builder().name("Business 1").address("Sarnia")
                .owner(person1).postalCode("N7T 5R5").customers(new ArrayList<>(){{add(person1);}}).build();

         final Business business2 = Business.builder().name("Business 2").address("Brampton")
                .owner(person2).postalCode("N2R 5T7").customers(new ArrayList<>(){{add(person2);add(person3);}}).build();

         Map<Person,Business> mapper = new HashMap<>();
//         mapper.put(person1,business1);
        List<Business> business = new ArrayList<>();
//        business.add(business1);

        business.add(business1);
        business.add(business2);
         mapper = MidTermQuestions.questionFour(business);
         System.out.println(mapper.entrySet());
         mapper.entrySet().forEach( entry -> {
             System.out.println(entry.getKey() +"----> "+entry.getValue());
                 }
         );

         Map<String,Integer> hashMap = new HashMap<>();
         hashMap.put(business1.getName(), 2000);
         hashMap.put(business2.getName(), 3000);
        Map<Person,Integer> res =  MidTermQuestions.questionFive(business,hashMap);

         res.forEach((key, value) -> System.out.println(key + "----> " + value));

         System.out.println(MidTermQuestions.questionSix(455));


    }
}
