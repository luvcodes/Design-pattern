package SecondVersion;

/**
 * @author ryanw
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        // 创建Book对象
        Book book = new Book("Effective Java", "Joshua Bloch");
        book.printBook();

        // 使用clone方法克隆Book对象
        Book clonedBook = (Book) book.clone();
        clonedBook.printBook();

        // 修改克隆对象的属性以证明它是独立的
        clonedBook.setTitle("Effective Java (Clone) ");
        clonedBook.printBook();
        book.printBook();
    }
}
