package midterm;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MidTermQuestions {
    public static List<Person> questionOne(List<Business> business, String name){
        /**
         * takes List<Business> and String name as an argument and
         * returns List<Person> of all the customers that have visited a business with String name
         */
        return business.stream().filter(b-> name.equals(b.getName()))
                .flatMap(p->p.getCustomers().stream()).collect(Collectors.toList());
    }
//
    public static  List<Person> questionTwo(List<Business> businesses)
    {
        /**
         * functions that takes list of business List<Business> as an argument and
         * returns List<Person> all the people that are owner that are customer of their own business
         */
        return businesses.stream().filter(business->business.getCustomers().stream().anyMatch(c->c.equals(business.getOwner())))
                .map(Business::getOwner).collect(Collectors.toList());
    }

    public static List<Pet> questionThree(List<Business> business){
        /**
         * function takes List<Business> as an arguments and
         * returns the List<Pet> distinct list of every pet of all customer
         */
        List<Person> customers = business.stream().flatMap(b -> b.getCustomers().stream()).toList();
        List<Pet> pets = customers.stream().flatMap(p -> p.getPets().stream()).toList();
        return pets.stream().filter(pets::contains).distinct().collect(Collectors.toList());

    }

    public static Map<Person,Business> questionFour(List<Business> business){
        /**
         * function that takes List<Business> as an arguments
         * and returned the result in form of  Map<Person,Business>
         */
        return business.stream().collect(Collectors.toMap(Business::getOwner,b->b));
    }

    public static Map<Person,Integer> questionFive(List<Business> business, Map<String,Integer> mappedData){
        /**
         * function that takes List<Business> list of business and Map<String, Integer>
         * hashmap of string and integer containing business name
         * and revenue and returns the Map<Person, Integer> hash map of person and integer containing
         * owner details and revenue
         */

        return business.stream().collect(
                Collectors.toMap(Business::getOwner,b->mappedData.get(b.getName())));
    }
    public static String questionSix(Integer number){
        /**
         * takes integer value as an argument and
         * returns the string representation of number
         */
        String stringRepresentation = "";
        String[] unitsArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensArray = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety"};

        if (number == 0) {
            return "zero";
        }


        if ((number / 1000000) > 0) {
            stringRepresentation += questionSix(number / 1000000) + " million ";
            number %= 1000000;
        }

        if ((number / 1000) > 0) {
            stringRepresentation += questionSix(number / 1000) + " thousand ";
            number %= 1000;
        }

        if ((number / 100) > 0) {
            stringRepresentation  += questionSix(number / 100) + " hundred ";
            number %= 100;
        }
        
        if (number < 20) stringRepresentation += unitsArray[number];
        else {
            stringRepresentation += tensArray[number / 10];
            if ((number % 10) > 0)
                stringRepresentation +=  " " + unitsArray[number % 10];
        }
        return stringRepresentation;
    }

    public static Integer questionSeven(Integer a, Integer b){
        /**
         * takes two integer arguments a and b and return their product
         * call functions recursively until the base case is met
         */
        if(a == 0 || b == 0){
            return 0;
        }

        return a + questionSeven(a,b-1);
    }

}
