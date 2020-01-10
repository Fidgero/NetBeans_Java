package sptv18school;
import entity.Journal;
import entity.Person;
import entity.Subject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SaverToFile {    
    public void savePerson(List<Person> person) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Person.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Файла Person.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Проблема записи в Person.txt", ex);
        }
    }
    public List<Person> loadPerson() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
       
        try {
            fileInputStream = new FileInputStream("Person.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Person>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет файла Person.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Проблема чтения Person.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Неизвестный класс Person.txt", ex);
        }
        return new ArrayList<Person>();
    }
    
    public void saveSubject(List<Subject> subject) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Subject.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(subject);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Файла Subject.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Проблема записи в Subject.txt", ex);
        }
    }
    public List<Subject> loadSubject() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
       
        try {
            fileInputStream = new FileInputStream("Subject.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Subject>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет файла Subject.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Проблема чтения Subject.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Неизвестный класс Subject.txt", ex);
        }
        return new ArrayList<Subject>();
    }
    
    public void saveJournal(List<Journal> journal) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Journal.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(journal);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Файла Journal.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Проблема записи в Journal.txt", ex);
        }
    }
    public List<Journal> loadJournal() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
       
        try {
            fileInputStream = new FileInputStream("Journal.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Journal>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет файла Journal.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Проблема чтения Journal.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Неизвестный класс Journal.txt", ex);
        }
        return new ArrayList<Journal>();
    }
}