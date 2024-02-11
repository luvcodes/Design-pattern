/**
 * @author ryanw
 */
public class Printer implements Printable{
    private String name;
    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成Printer的实例 (" + name + ")");
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    // 显示带打印机名字的文字
    @Override
    public void print(String string) {
        System.out.println("====" + name + "====");
        System.out.println(string);
    }

    // 重活
    private void heavyJob(String msg) {
        System.out.println(msg);
        // 干五秒钟重活
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(".");
        }
        System.out.println("结束");
    }
}
