import midterm.Business;
import midterm.MidTermQuestions;
import midterm.Person;
import midterm.Pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MidTermQuestionsTest {

    /**
     * building the test cases
     * and defining the test variables along with the values.
     */
    private final Pet pet1 = Pet.builder().name("Mew Mew").age(3).type("Persian").build();
    private final Pet pet2 = Pet.builder().name("Kitty").age(5).type("Ragdoll").build();
    private final Pet pet3 = Pet.builder().name("Daisy").age(6).type("Sphynx").build();
    private final Person person1 = Person.builder().name("Pujan").age(25)
                                   .pets(new ArrayList<Pet>(){{add(pet1);}}).build();
    private final Person person2 = Person.builder().name("Sujan").age(19)
            .pets(new ArrayList<Pet>(){{add(pet2);add(pet1);}}).build();

    private final Person person3 = Person.builder().name("Happy").age(21)
            .pets(new ArrayList<Pet>(){{add(pet3);}}).build();

    private final Business business1 = Business.builder().name("Business 1").address("Sarnia")
            .owner(person1).postalCode("N7T 5R5").customers(new ArrayList<>(){{add(person1);}}).build();

    private final Business business2 = Business.builder().name("Business 2").address("Brampton")
            .owner(person2).postalCode("N2R 5T7").customers(new ArrayList<>(){{add(person2);add(person3);}}).build();

    @Test
    public void questionOneTest(){
        /**
         * test that provides business list and name of business as an argument to a function
         * and checks whether the returned list of customers of business matches the expected result or not
         */
        List<Business> business = new ArrayList<>();
        business.add(business2);
        business.add(business1);
        List<Person> expectedResult = new ArrayList<>();
        expectedResult.add(person2);
        expectedResult.add(person3);
        List<Person> persons = MidTermQuestions.questionOne(business,"Business 2");
        assertEquals(expectedResult,persons);
        assertEquals(persons.size(),2);
    }

    @Test
    public void questionTwoTest(){
        List<Person> expectedResult = new ArrayList<>();
        expectedResult.add(person2);
        List<Business> business = new ArrayList<>();
        business.add(business2);
        List<Person> persons = MidTermQuestions.questionTwo(business);
        assertEquals(expectedResult,persons);
    }

    @Test
    public void questionThreeTest(){
        /**
         * test of function that takes list of business as an arguments and returns
         * distinct list of pets of the customers of those businesses
         */
        List<Pet> expectedResults = new ArrayList<>();
        expectedResults.add(pet1);
        expectedResults.add(pet2);
        expectedResults.add(pet3);
        List<Business> business = new ArrayList<>();
        business.add(business1);
        business.add(business2);
        List<Pet> pets = MidTermQuestions.questionThree(business);
        assertEquals(pets,expectedResults);
        assertEquals(3,pets.size());
    }

    @Test
    public void questionFourTest(){
        List<Business> businesses = new ArrayList<>();
        businesses.add(business1);
        businesses.add(business2);
        Map<Person,Business> expectedResult = new HashMap<>();
        expectedResult.put(person1,business1);
        expectedResult.put(person2,business2);
        Map<Person,Business> returnedValue = MidTermQuestions.questionFour(businesses);
        assertEquals(expectedResult,returnedValue);
    }

    @Test
    public void questionSevenTest(){
        /**
         * this test calls the function MidTermQuestions.questionSeven() that takes two Integer
         * arguments a and b and returned the product of a and b using recursion and
         * addition approach.
         */
        Integer expectedResult = 20;
        Integer calculatedResult = MidTermQuestions.questionSeven(5,4);
        assertEquals(expectedResult,calculatedResult);
    }

}
