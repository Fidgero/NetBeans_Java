
package provider;

import entity.Subject;
import java.util.Scanner;

public class ProviderSubject {
    public Subject createSubject(){
        Scanner scanner = new Scanner(System.in);
        
        Subject subject = new Subject();
        
        System.out.println("Предмет");
        String Subject = scanner.nextLine();
        subject.setSchoolSubject(Subject);
        
        System.out.println("кол-во часов");
        int hours = scanner.nextInt();
        subject.setHours(hours);
        
        return subject;
    }
}
