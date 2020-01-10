
package provider;

import entity.Person;
import entity.Subject;
import entity.Journal;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProviderJournal {
    public Journal createJournal(List<Person> peoples, List<Subject> schoolSubjects){
        
        Scanner scanner = new Scanner(System.in);
        
        Person person;
        Subject subject;
        Journal journal = new Journal();
        System.out.println("Список учеников/учителей");
        for (int i = 0; i < peoples.size(); i++) {
            person = peoples.get(i);
            System.out.println(i+1+". "+person.toString());
        }
        System.out.println("Выберите номер ученика:");
        int numPeople = scanner.nextInt();
        journal.setPeople(peoples.get(numPeople-1));
        System.out.println("Список предметов:");
            for (int i = 0; i < schoolSubjects.size(); i++) {
            subject = schoolSubjects.get(i);
            System.out.println(i+1+". "+subject.toString());
        }
        System.out.println("Выберите номер читателя:");
        int numSchoolSubjects = scanner.nextInt();
        journal.setSubject(schoolSubjects.get(numSchoolSubjects-1));
        journal.setGiveOutBook(new Date());
        return journal;
    }
}