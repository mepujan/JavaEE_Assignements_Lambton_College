package test;

import A1.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    /**
     * testing the setName function of Dog Class
     */
    @Test
    public void settingDogNameTest(){
    Dog dog = new Dog("Husky",10);
    dog.setName("German Shepard");
    assertEquals("German Shepard",dog.getName());
    }

    /**
     *Testing setAge function of Dog Class
     */

    @Test
    public void settingDogAge(){
        Dog dog = new Dog("Husky",10);
        dog.setAge(16);
        assertEquals(16,dog.getAge());
        assertNotEquals(10,dog.getAge());
    }

    /**
     * Testing two objects of Dog class are equals or not
     */

    @Test
    public void isEqualTwoDogObjects(){
        Dog d1 = new Dog("Husky",10);
        Dog d2 = new Dog("Husky",10);
        assertEquals(true,d1.equals(d2));
    }

}