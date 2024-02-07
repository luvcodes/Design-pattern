/**
 * @author ryanw
 */
public class Singleton {
    // 创建实例对象
    public static Singleton singleton = new Singleton();

    // 设置私有的构造器
    private Singleton() {
        System.out.println("生成了一个实例");
    }

    // 提供对外获取实例对象的方法
    public static Singleton getInstance() {
        return singleton;
    }
}
