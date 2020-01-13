
package entity;

import java.io.Serializable;
import java.util.Date;

public class Journal implements Serializable {
    private Date giveOutJournal;
    private Date returnJournal;
    private String mark;
    private Person person;
    private Subject subject;

    public Journal() {
    }

    public Journal(Date giveOutJournal, Date returnJournal, String mark, Person person, Person secondName, Subject subject) {
        this.giveOutJournal = giveOutJournal;
        this.returnJournal = returnJournal;
        this.mark = mark;
        this.person = person;
        this.subject = subject;
    }

    public Date getGiveOutJournal() {
        return giveOutJournal;
    }

    public void setGiveOutJournal(Date giveOutJournal) {
        this.giveOutJournal = giveOutJournal;
    }

    public Date getReturnJournal() {
        return returnJournal;
    }

    public void setReturnJournal(Date returnJournal) {
        this.returnJournal = returnJournal;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Journal{" + "giveOutJournal=" + giveOutJournal + ", returnJournal=" + returnJournal + ", mark=" + mark
                + ", person=" + person.getFirstName() 
                + " " + person.getSecondName()
                + ", subject=" + subject.getSubjectName() + '}';
    }

    
}