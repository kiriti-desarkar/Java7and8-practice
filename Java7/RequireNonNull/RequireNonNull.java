package Java7.RequireNonNull;

import java.util.Objects;

public class RequireNonNull {

    public static void main(String[] args) {
        Person person = null;
        processPersonDetails(person);
    }

    private static void processPersonDetails(Person person){
        Objects.requireNonNull((person), "Person object cannot be null");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }
    
}

class Person{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
