
package Provider;

import entity.Book;
import java.util.Scanner;

public class ProviderBook {
        public Book createBook(){
            Scanner scanner = new Scanner(System.in);
            
            Book book = new Book();
            System.out.println("Название книги:");
            String title = scanner.nextLine();
            book.setTitle(title);
            System.out.println("Автор книги:");
            String author = scanner.nextLine();
            book.setAuthor(author);
            System.out.println("Год издания книги:");
            int publishedYear = scanner.nextInt();scanner.nextLine();
            book.setPublishedYear(publishedYear);
            return book;
        }
}
