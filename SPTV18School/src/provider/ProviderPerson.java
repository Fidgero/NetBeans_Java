
package provider;

import entity.Person;
import java.util.Scanner;

public class ProviderPerson {
    public Person createPerson(){
        Scanner scanner = new Scanner(System.in);
        
        Person person = new Person();
        
        System.out.println("Имя");
        String people = scanner.nextLine();
        person.setPeople(people);
        
        System.out.println("Учитель/Ученик(-ца)");
        String status = scanner.nextLine();
        person.setStatus(status);
        
        return person;
    }
}
