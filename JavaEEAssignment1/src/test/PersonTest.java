package test;
import A1.Dog;
import A1.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    //creating global dog and person objects
    Dog dog = new Dog("Tyson",12);
    Person person = new Person("Pujan",25,dog);

    /**
     * testing changing the name and matching
     * if the expected changed name matches the name of that Dog instance
     */
    @Test
    public void changedDogNameHavingPetTest(){
        person.changeDogName("Husky");
        assertEquals("Husky",dog.getName());
        assertNotEquals("Leo",dog.getName());
    }


    /***
     * testing if NullPointerException is Thrown or not and checking
     * the error message thrown by the exception is equal to expected error message
     */
    @Test
    public void changeDogNameWhenNotHavingPetTest(){
        Person persons = new Person("Pujan",25);
        RuntimeException errorThrown = assertThrows(RuntimeException.class,
                ()->{persons.changeDogName("Leo");});
        assertEquals(persons.getName() + " doesnot own a dog",errorThrown.getMessage());

    }

    /**
     * testing the owner has dog or not and the age of dog is greater than 10
     */
    @Test
    public void hasOldDogMethodTest(){
        person.hasOldDog();
        assertEquals(true,person.hasOldDog());
    }

}