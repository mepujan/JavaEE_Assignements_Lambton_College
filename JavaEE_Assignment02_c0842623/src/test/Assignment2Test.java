package test;
import static A2.Assignment2.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Assignment2Test {
    List<Integer> numbers = Arrays.asList(1,5,8,2,4,7,10);

    //Test case for question no 1
    @Test
    public void  question1Test(){
        assertEquals(10,question1(numbers));
        assertNotEquals(9,question1(numbers));
    }

    // Test Case for question no 2
    @Test
    public void question2Test(){
        List<Integer> expectedResult = Arrays.asList(5,8,7,10);
        assertEquals(expectedResult,question2(numbers,4));
    }

    //Test case for question no 3
    @Test
    public void question3Test(){
        List<String> expectedResult = Arrays.asList("1","Buzz","Fizz","Fizz","Fizz","7","FizzBuzz");
        assertEquals(expectedResult,question3(numbers));
    }

    //Test Case for question no 4

    @Test
    public void question4Test(){
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("Welcome",10);
        hashMap.put("to",8);
        hashMap.put("JavaEE",6);
        hashMap.put("Testing",7);
        hashMap.put("Class",14);
        assertEquals(true,question4(hashMap,7));
        assertEquals(false,question4(hashMap,5));
    }


    // Test Case for que no 5
    @Test
    public void question5Test(){
        List<Integer> expectedResult = Arrays.asList(10,8,7);
        assertEquals(expectedResult,question5(numbers,3));
        assertNotEquals(expectedResult,question5(numbers,2));
    }


}