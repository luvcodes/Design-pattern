package Practice;

/**
 * @author ryanw
 */
public class AdapterPattern {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        Adapter adapter = new Adapter(speaker);
        System.out.println(adapter.translate());
    }
}
