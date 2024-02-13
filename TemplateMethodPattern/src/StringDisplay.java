/**
 * @author ryanw
 */
public class StringDisplay extends AbstractDisplay{
    // 需要显示的字符串
    private String string;

    // 以字节为单位计算出的字符串长度
    private int width;

    // 构造函数中接收的字符串被保存在字段中
    public StringDisplay(String string) {
        this.string = string;
        // 将字符串的字节长度也保存在字段中
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
