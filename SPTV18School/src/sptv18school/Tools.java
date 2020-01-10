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
    
    public void printTakedOnBooks(List<Journal> journals){
        int n = 1;
        for(int i = 0; i < journals.size(); i++){
            Journal journal = journals.get(i);
            if(journal.getReturnJournal()== null){
                System.out.printf("%d. Книгу \"%s\" читает %s %s%n"
                        ,n
                        ,journal.getMark()
                        ,journal.getPeople()
                        ,journal.getSubject()
                );
                n++;
            }
        }
    }

    void printListPerson(List<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            System.out.println(i + 1 + ". " + person.toString());
        }
        System.out.println("Для редактирования книги введите ее номер или 0:");
        int indexPerson = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexBook){
            Book book = books.get(indexBook-1);
            book = editBook(book);
            books.set(indexBook-1, book);
        }
    }

    private Book editBook(Book book) {
        System.out.println("Введите правильное значение:");
        System.out.print("Заголовок: ");
        System.out.println(book.getTitle());
        System.out.print("Исправить на: ");
        String newTitle = scanner.nextLine();
        System.out.print("Автор: ");
        System.out.println(book.getAuthor());
        System.out.print("Исправить на: ");
        String newAuthor = scanner.nextLine();
        System.out.print("Год издания: ");
        System.out.println(book.getPublishedYear());
        System.out.print("Исправить на: ");
        int newPublishedYear = scanner.nextInt();
        scanner.nextLine();
        if(!"0".equals(newTitle)){
           book.setTitle(newTitle); 
        }
        if(!"0".equals(newAuthor)){
           book.setAuthor(newAuthor); 
        }
        if(0 != newPublishedYear){
           book.setPublishedYear(newPublishedYear); 
        }
        return book;
    }
}