package RepresentMethod_;

import InheritanceMethod_.PrintBanner;

/**
 * @author ryanw
 */
public class Main {
    public static void main(String[] args) {
        PrintBanner banner = new PrintBanner("Hello");
        banner.printWeak();
        banner.printStrong();
    }
}
