
package provider;

import entity.Person;
import entity.Subject;
import entity.Journal;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProviderJournal {
    public Journal createJournal(List<Person> persons, List<Subject> subjectsName){
        Scanner scanner = new Scanner(System.in);
        Person person;
        Subject subject;
        Journal journal = new Journal();
        System.out.println("Список учеников/учителей");
        for (int i = 0; i < persons.size(); i++) {
            person = persons.get(i);
            System.out.println(i+1+". "+person.toString());
        }
        System.out.println("Выберите номер ученика:");
        int numPeople = scanner.nextInt();
        Person student = persons.get(numPeople - 1);
        journal.setPerson(student);
        System.out.println("Список предметов:");
            for (int i = 0; i < subjectsName.size(); i++) {
            subject = subjectsName.get(i);
            System.out.println(i+1+". "+subject.toString());
        }
        System.out.println("Выберите номер предмета:");
        int numSubjectsName = scanner.nextInt();
        scanner.nextLine();
        subject = subjectsName.get(numSubjectsName - 1);
        journal.setSubject(subject);
        journal.setGiveOutJournal(new Date());
        System.out.println("Оценка");
        String mark = scanner.nextLine();
        journal.setMark(mark);
        return journal;
    }
}