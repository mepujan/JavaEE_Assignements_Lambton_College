/**
 * Assignment no 2
 * Pujan Gautam - c0842623
 * Date of Submission: 10/7/2022
 */

package A2;
import java.util.*;
import java.util.stream.Collectors;

public class Assignment2 {
    public static void main(String args[]){
        // Creating list of integers array
        List<Integer> numbers = Arrays.asList(4,5,9,3,1,8,7,10);

        //creating hashmap
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("Welcome",10);
        hashMap.put("to",8);
        hashMap.put("JavaEE",6);
        hashMap.put("Lecture",7);


        //Question 1
        System.out.println("Largest Number = "+question1(numbers));

        //Question 2:
        List<Integer> maxValues = question2(numbers,3);
        System.out.println("Max values = "+maxValues);

        // Question 3 : Fizz Buzz
        System.out.println(question3(numbers));

        //Question 4
        System.out.println(question4(hashMap,5));

        //Question 5
        System.out.println(question5(numbers,3));
    }

    // Question 1: Returning the largest number from the list
    public static Integer question1(List<Integer> nums){
        return  nums.stream().max(Integer::compare).get();
    }

    //Question2: Returning the values larger than provided integer value n
    public static List<Integer> question2(List<Integer> nums , Integer n){
        return  nums.stream().filter(num -> num > n).collect(Collectors.toList());
    }

    //Question 3: Fizz Buzz
    public static List<String> question3(List<Integer> nums){
       return  nums.stream().map(
                num -> num % 2 == 0 && num % 5 == 0 ? "FizzBuzz" :
                        num % 2 == 0 ? "Fizz":num % 5 == 0 ? "Buzz":num.toString()
        ).collect(Collectors.toList());
    }

    //Question 4: Returning boolean true or false if maps contains value less than given number n
    public static boolean question4(Map<String,Integer> hashMap,Integer num){
        return hashMap.values().stream().anyMatch(val -> val < num);
    }

    //Question 5: returning list of "n" largest numbers from the list provided
    public static List<Integer> question5(List<Integer> nums, Integer n){
        return  nums.stream().sorted(Comparator.reverseOrder())
                .limit(n).collect(Collectors.toList());
    }

}
