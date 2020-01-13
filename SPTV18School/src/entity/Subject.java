
package entity;

import java.io.Serializable;

public class Subject implements Serializable {
    private String subjectName;
    private int hours;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName
                = subjectName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public String toString() {
        return "Subject{" +"subjectName = " +subjectName+ ", hours = " +hours+ "}";
    }
}
