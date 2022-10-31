package test;

import A3.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PersonTest {

    @Test
    public void personWithNullId(){
        /**
         * function that checks whether the thrown error message matches
         * the user defined message in the constructor when id is null.
         */
        RuntimeException errorThrown = assertThrows(RuntimeException.class,()->{
           Person.builder()
                    .id(null)
                    .firstName("Pujan")
                    .lastName("Gautam")
                    .age(25)
                    .build();;
        });
        assertEquals("Id Cannot Be Null.",errorThrown.getMessage());
    }

    @Test
    public void personWithNullOREmptyFirstName(){
        /**
         * function that checks whether the thrown error message matches
         * the user defined message in the constructor when firstName is null or empty string.
         */
        RuntimeException errorThrown = assertThrows(RuntimeException.class,()->{
            Person.builder()
                    .id("c0842623")
                    .firstName("")
                    .lastName("Gautam")
                    .age(25)
                    .build();;
        });
        assertEquals("Firstname cannot be null or empty.",errorThrown.getMessage());
    }

    @Test
    public void personWithNullOREmptyLastName(){
        /**
         * function that checks whether the thrown error message matches
         * the user defined message in the constructor when lastName is null or empty string.
         */
        RuntimeException errorThrown = assertThrows(RuntimeException.class,()->{
            Person.builder()
                    .id("c0842623")
                    .firstName("Pujan")
                    .lastName(null)
                    .age(25)
                    .build();;
        });
        assertEquals("Lastname cannot be null or empty.",errorThrown.getMessage());
    }

    @Test
    public void personWithAgeLessThanZero(){
        /**
         * function that checks whether the thrown error message matches
         * the user defined message in the constructor when age is less than zero.
         */
        RuntimeException errorThrown = assertThrows(RuntimeException.class,()->{
            Person.builder()
                    .id("c0842623")
                    .firstName("Pujan")
                    .lastName("Gautam")
                    .age(-25)
                    .build();;
        });
        assertEquals("Age Should be greater than oe equals to  zero.",errorThrown.getMessage());
    }

    @Test
    public void personWithAllValidArguments(){
        /**
         * function that checks whether values created when instantiating the object
         * matches the values return by their getter method when called from that instance
         */
        Person person = Person.builder()
                .id("c0842623")
                .firstName("Pujan")
                .lastName("Gautam")
                .age(25)
                .build();
        assertEquals("c0842623",person.getId());
        assertEquals("Pujan",person.getFirstName());
        assertEquals("Gautam",person.getLastName());
        assertEquals(25,person.getAge());

    }



}