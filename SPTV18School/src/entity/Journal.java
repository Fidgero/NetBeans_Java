
package entity;

import java.io.Serializable;
import java.util.Date;

public class Journal implements Serializable {
    private Date giveOutJournal;
    private Date returnJournal;
    private String mark;
    private String people;
    private String subject;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public Date getGiveOutJournla() {
        return giveOutJournal;
    }

    public void setGiveOutBook(Date giveOutJournla) {
        this.giveOutJournal = giveOutJournla;
    }
    
    public Date getReturnJournal() {
        return returnJournal;
    }

    public void setReturnJournal(Date returnJournal) {
        this.returnJournal = returnJournal;
    }
    
    public String toString() {
        return "Jornal{" +"date = " +giveOutJournal+ ", mark = " +mark+ ", people = " +people+ ", subject = " +subject+"}";
    }
}
