
package sptv18library;

import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Saveble;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SaverToBase implements Saveble{
    private EntityManager em;
    private EntityTransaction tx;

    public SaverToBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SPTV18LibraryPU");
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }

    @Override
    public void saveBooks(List<Book> books) {
        for(Book book: books){
           if(book.getId() == null){
               
                tx.begin();
                    em.persist(book);
                tx.commit();
            }
        }
    }

    @Override
    public List<Book> loadBooks() {
        List<Book> books = em.createQuery("SELECT b FROM Book b").getResultList();
        return books;
    }

    @Override
    public void saveReaders(List<Reader> readers) {
        for(Reader reader: readers){
           if(reader.getId() == null){
               
                tx.begin();
                    em.persist(reader);
                tx.commit();
            }
        }
    }

    @Override
    public List<Reader> loadReaders() {
        List<Reader> readers = em.createQuery("SELECT r FROM Reader r").getResultList();
        return readers;
    }

    @Override
    public void saveHistory(List<History> historys) {
        for(History history: historys){
           if(history.getId() == null){
               
                tx.begin();
                    em.persist(history);
                tx.commit();
            }
        }
    }

    @Override
    public List<History> loadHistory() {
        List<History> historys = em.createQuery("SELECT h FROM History h").getResultList();
        return historys;
    }
    
}
