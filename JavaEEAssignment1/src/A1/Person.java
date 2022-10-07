package A1;
import java.util.Optional;

public class Person{
    String name;
    Integer age;
    Optional<Dog> dog;

    /**
     *
     * @param name
     * @param age
     */
    public Person(String name,Integer age){
      this(name,age,null);
    }

    /**
     *
     * @param name
     * @param age
     * @param dog
     */
    public Person(String name, Integer age, Dog dog){
        this.setName(name);
        this.setAge(age);
        this.dog = Optional.ofNullable(dog);
    }

    /**
     *
     * @return boolean true if dog is present and its age is greater than 10, Otherwise false.
     */
    public boolean hasOldDog(){
        boolean isPresent = this.dog.isPresent();
        return isPresent && this.dog.filter(d ->d.getAge() > 10).isPresent();
    }

    /**
     *
     * @param newName
     * takes newName as an argument and if the dog is present changes the name of dog
     * if no dog is present then it throws exception displaying the message
     */

    public void changeDogName(String newName){
            this.dog.map(d -> d.name = newName).
                    orElseThrow(() -> {
                        throw new RuntimeException(this.name + " doesnot own a dog");
                    });
    }


// getter and setter

    /**
     *
     * @return the name value of the current instance
     */

    public String getName(){
        return this.name;
    }

    /**
     *
     * @return the age value of the current instance
     */
    public Integer getAge(){
        return this.age;
    }

    //setter

    /**
     *
     * @param newName
     * set the value of name variable as per the value provided by user
     */
    public void setName(String newName){
        this.name = newName;
    }

    /**
     *
     * @param age
     * set the value of age variable as per the value provided by user
     */
    public void setAge(Integer age){
        this.age = age;
    }

    /**
     *
     * @param obj
     * @return true if both objects are equals otherwise false.
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person personObj){
            return this.name == personObj.name && this.age == personObj.age;
        }
        return false;
    }

}
