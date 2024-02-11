/**
 * @author ryanw
 */
public class PrinterProxy implements Printable{
    // 名字
    private String name;
    // 本人
    private Printer real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    // 设置名字
    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            // 设置本人名字
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (name == null) {
            real = new Printer(name);
        }
    }
}
