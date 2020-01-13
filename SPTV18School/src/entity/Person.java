
package entity;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String secondName;
    private String status;

    public Person() {
    }

    public Person(String firstName, String secondName, String status) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String SecondName) {
        this.secondName = SecondName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", SecondName=" + secondName + ", status=" + status + '}';
    }

    
}