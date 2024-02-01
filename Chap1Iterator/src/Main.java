/**
 * @author ryanw
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("BookA"));
        bookShelf.appendBook(new Book("BookB"));
        bookShelf.appendBook(new Book("BookC"));
        bookShelf.appendBook(new Book("BookD"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
