package Practice5_2;

/**
 * @author ryanw
 */
public class TripleTest {
    public static void main(String[] args) {
        // 获取三个实例
        Triple triple0 = Triple.getInstance(0);
        Triple triple1 = Triple.getInstance(1);
        Triple triple2 = Triple.getInstance(2);

        // 测试是否为相同的实例
        System.out.println("Testing if instances are the same object:");
        System.out.println("Triple 0 == Triple 1? " + (triple0 == triple1));
        System.out.println("Triple 1 == Triple 2? " + (triple1 == triple2));
        System.out.println("Triple 2 == Triple 0? " + (triple2 == triple0));

        // 测试是否id分配正确
        System.out.println("\nTesting if instances have correct ids:");
        System.out.println("Id of Triple 0: " + triple0.getId());
        System.out.println("Id of Triple 1: " + triple1.getId());
        System.out.println("Id of Triple 2: " + triple2.getId());

        // 尝试获取一个非法id的实例，应该抛出异常
        System.out.println("\nTesting instance retrieval with invalid id:");
        try {
            Triple.getInstance(3);
            System.out.println("Triple.getInstance(3) should have thrown an exception but did not.");
        } catch (IllegalArgumentException e) {
            System.out.println("Expected exception for Triple.getInstance(3): " + e.getMessage());
        }
    }
}
