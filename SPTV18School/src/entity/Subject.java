
package entity;

import java.io.Serializable;

public class Subject implements Serializable {
    private String schoolSubject;
    private int hours;

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public String toString() {
        return "Subject{" +"subject = " +schoolSubject+ ", hours = " +hours+ "}";
    }
}
