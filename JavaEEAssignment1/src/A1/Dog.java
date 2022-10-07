package A1;

public class Dog {
    String name;
    Integer age;

    /**
     *
     * @param name
     * @param age
     */
    public Dog(String name, Integer age){
        this.setName(name);
        this.setAge(age);
    }

    //setter

    /**
     *
     * @param name
     * sets the value to name variable
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @param age
     * sets the value to age variable
     */
    public void setAge(Integer age){
        this.age = age;
    }

    //getter methods

    /**
     *
     * @return value of name variable of the current dog instance
     */

    public String getName(){
        return this.name;
    }

    /**
     *
     * @return age value of current dog instance
     */

    public Integer getAge(){
        return this.age;
    }

    //equals method

    /**
     *
     * @param obj
     * @return true if both objects are equal otherwise false
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Dog dogObj){
            return this.name == dogObj.name & this.age == dogObj.age;
        }
        return false;
    }

}


