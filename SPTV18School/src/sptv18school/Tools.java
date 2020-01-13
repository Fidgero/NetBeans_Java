package sptv18school;

import entity.Person;
import entity.Journal;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tools {
    private Scanner scanner = new Scanner(System.in);

    void printListPerson(List<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            System.out.println(i + 1 + ". " + person.toString());
        }
        System.out.println("Для редактирования журнала введите ее номер или 0:");
        int indexPerson = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexPerson){
            Person person = persons.get(indexPerson-1);
            person = editPerson(person);
            persons.set(indexPerson-1, person);
        }
    }

    private Person editPerson(Person person) {
        System.out.println("Введите правильное значение:");
        System.out.print("Имя ");
        System.out.println(person.getFirstName());
        System.out.print("Исправить на: ");
        String newFirstName = scanner.nextLine();
        System.out.print("Фамилия ");
        System.out.println(person.getSecondName());
        System.out.print("Исправить на: ");
        String newSecondName = scanner.nextLine();
        System.out.print("Статус: ");
        System.out.println(person.getStatus());
        System.out.print("Исправить на: ");
        String newStatus = scanner.nextLine();
        
        
        if(!"0".equals(newFirstName)){
           person.setFirstName(newFirstName); 
        }
        if(!"0".equals(newSecondName)){
           person.setSecondName(newSecondName); 
        }
        if(!"0".equals(newStatus)){
           person.setStatus(newStatus); 
        }
        return person;
    }
}