import java.util.ArrayList;

/**
 * @author ryanw
 * 实现aggregate接口，承载多本书
 */
public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    private int last = 0;

    public BookShelf() {
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
