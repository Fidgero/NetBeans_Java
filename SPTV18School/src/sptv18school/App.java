package sptv18school;
import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import provider.ProviderJournal;
import provider.ProviderPerson;
import provider.ProviderSubject;
import sptv18school.SaverToFile;
public class App {
    List<Person> persons = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();
    List<Journal> journals = new ArrayList<>();
    SaverToFile saveToFile;
   
    public App() {
        saveToFile = new SaverToFile();
        persons.addAll(saveToFile.loadPerson());
        subjects.addAll(saveToFile.loadSubject());
        journals.addAll(saveToFile.loadJournal());
    }
   
    public void run(){
        System.out.println("<=== Это Школа ===>");
        boolean repeat = true;
        Tools tools = new Tools();
        do {
            System.out.println(" ");
            System.out.println("  Список задач: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить новую человека");
            System.out.println("2. Добавить новый Предмет");
            System.out.println("3. Добавить новый журнал");
            System.out.println("4. Показать список людей");
            System.out.println("5. Показать список предметов");
            System.out.println("6. Показать список журналов");
            System.out.println("7. Изменение данных");
            System.out.println(" Выбери номер задачи: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println(" Программа закрывается.");
                    repeat = false;
                    break;
                   
                case 1:
                    ProviderPerson providerPerson = new ProviderPerson();
                    Person person = providerPerson.createPerson();
                   
                    persons.add(person);
                    saveToFile.savePerson(persons);
                   
                    System.out.println(" Добавлен новый человек. " + person.toString());
                    break;
                   
                case 2:
                    ProviderSubject providerSubject = new ProviderSubject();
                    Subject subject = providerSubject.createSubject();
                   
                    subjects.add(subject);                    
                    saveToFile.saveSubject(subjects);
                   
                    System.out.println(" Добавлен новый предмет.");
                    System.out.println(subject.toString());
                    break;
                   
                case 3:
                    ProviderJournal providerJournal = new ProviderJournal();
                    Journal journal = providerJournal.createJournal(persons, subjects);
                    
                    journals.add(journal);
                    saveToFile.saveJournal(journals);
                    
                    System.out.println(" Добавлен новый журнал");
                    System.out.println(journal.toString());
                    break;
                   
                case 4:
                    System.out.println(" Список людей ");
                    for (int i = 0; i < persons.size(); i++) {
                        System.out.println(i + 1 + ". " + persons.get(i).toString());
                    }
                    break;
                   
                case 5:
                    System.out.println(" Список предметов ");
                    for (int i = 0; i < subjects.size(); i++) {
                        System.out.println(i + 1 + ". " + subjects.get(i).toString());
                    }
                    break;
                   
                case 6:
                    System.out.println(" Список журналов ");
                    for (int i = 0; i < journals.size(); i++) {
                        System.out.println(i + 1 + ". " + journals.get(i).toString());
                    }
                    break;
                case 7:
                    System.out.println("Список журналов:");
                    
                    break;
            }
        } while (repeat);
    }
}