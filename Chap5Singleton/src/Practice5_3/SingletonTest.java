package Practice5_3;

/**
 * 验证多线程访问懒汉式模式
 * @author ryanw
 * */
public class SingletonTest {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
            }
        });

        // 启动两个线程
        threadOne.start();
        threadTwo.start();
    }
}