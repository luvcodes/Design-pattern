package ThirdVersion;

/**
 * @author ryanw
 */
public class Movie implements Product {
    private String name;
    private String director;

    public Movie(String name, String director) {
        this.name = name;
        this.director = director;
    }

    // 实现克隆方法
    @Override
    public Product clone() {
        return new Movie(this.name, this.director);
    }

    // 实现打印方法
    @Override
    public void printProduct() {
        System.out.println("Movie: " + name + ", Director: " + director);
    }
}
