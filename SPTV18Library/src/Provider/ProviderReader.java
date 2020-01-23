
package Provider;

import entity.Reader;
import java.util.Scanner;

public class ProviderReader {
    public Reader createReader(){
        Scanner scanner = new Scanner(System.in);
        
        Reader reader = new Reader();
        System.out.println("Имя читателя:");
        String firstname = scanner.nextLine();
        reader.setFirstname(firstname);
        System.out.println("Фамилия читателя:");
        String lastname = scanner.nextLine();
        reader.setLastname(lastname);
        System.out.println("Телефон:");
        String phone = scanner.nextLine();
        reader.setPhone(phone);
        return reader;
    }
}
