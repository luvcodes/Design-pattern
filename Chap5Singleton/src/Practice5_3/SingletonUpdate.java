package Practice5_3;

/**
 * @author ryanw
 */
public class SingletonUpdate {
    private static SingletonUpdate singleton = null;

    private SingletonUpdate() {
        System.out.println("生成了一个实例。");
    }

    // 同步方法，保证线程安全
    public static synchronized SingletonUpdate getInstance() {
        if (singleton == null) {
            singleton = new SingletonUpdate();
        }
        return singleton;
    }
}
