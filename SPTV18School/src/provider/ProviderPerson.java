
package provider;

import entity.Person;
import java.util.Scanner;

public class ProviderPerson {
    public Person createPerson(){
        Scanner scanner = new Scanner(System.in);
        
        Person persons = new Person();
        
        System.out.println("Имя");
        String firstName = scanner.nextLine();
        persons.setFirstName(firstName);
        
        System.out.println("Фамилия");
        String secondName = scanner.nextLine();
        persons.setSecondName(secondName);
        
        System.out.println("Учитель/Ученик(-ца)");
        String status = scanner.nextLine();
        persons.setStatus(status);
        
        return persons;
    }
}
