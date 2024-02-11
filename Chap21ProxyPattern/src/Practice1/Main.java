package Practice1;

/**
 * @author ryanw
 */
public class Main {
    public static void main(String[] args) {
        // 使用反射创建PrinterProxy实例
        Printable pReflective = new PrinterProxy("Alice", "Printer");
        System.out.println("Reflective Proxy current name is: " + pReflective.getPrinterName());
        pReflective.setPrinterName("Bob");
        System.out.println("Reflective Proxy updated name is: " + pReflective.getPrinterName());
        pReflective.print("Hello, World from Reflective Proxy");
    }
}
