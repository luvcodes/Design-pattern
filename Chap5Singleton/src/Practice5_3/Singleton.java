package Practice5_3;

/**
 * @author ryanw
 */
public class Singleton {
    // 静态实例变量，初始为null
    private static Singleton singleton = null;

    // 私有的构造方法，防止外部通过new创建多个实例
    private Singleton() {
        System.out.println("生成了一个实例。");
    }

    // 公共的静态方法，用于获取单例实例
    public static Singleton getInstance() {
        // 如果实例不存在，就创建一个新的实例
        if (singleton == null) {
            singleton = new Singleton();
        }
        // 如果实例已经存在，就直接返回该实例
        return singleton;
    }
}
