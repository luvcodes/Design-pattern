package ThirdVersion;

/**
 * @author ryanw
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        // 创建Book对象
        Product book = new Book("Effective Java", "Joshua Bloch");
        book.printProduct();

        // 克隆Book对象
        Product clonedBook = book.clone();
        clonedBook.printProduct();

        // 创建Movie对象
        Product movie = new Movie("Inception", "Christopher Nolan");
        movie.printProduct();

        // 克隆Movie对象
        Product clonedMovie = movie.clone();
        clonedMovie.printProduct();

        // 原本的Book和克隆的Book对象都是相同的
        System.out.println(book.equals(clonedBook));
    }
}
