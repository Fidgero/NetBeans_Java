
package entity;

import java.io.Serializable;

public class Person implements Serializable {
    private String people;
    private String status;

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString() {
        return "Person{" +"people = " + people +", status = "+ status +"}";
    }
}
