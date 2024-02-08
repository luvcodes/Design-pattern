package ThirdVersion;

/**
 * @author ryanw
 */
public class Book implements Product {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public Product clone() {
        return new Book(this.title, this.author);
    }

    @Override
    public void printProduct() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}
