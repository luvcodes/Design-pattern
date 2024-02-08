package SecondVersion;

/**
 * @author ryanw
 */
public class Book implements Cloneable{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 用于打印数据信息的方法
    public void printBook() {
        System.out.println("Book " + title + ", Author: " + author);
    }
}
