package A1;

//Name : Pujan Gautam
// Student Number: c0842623
//Date of Submission: 9/25/2022

public class mainDemoClass {
    public static void main(String[] args) {
       Person person = new Person("Pujan",25);
       // manipulating the methods defined
       System.out.println("Owner Has a Dog: "+person.hasOldDog());
        try {
            person.changeDogName("Leo");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
