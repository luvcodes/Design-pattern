/**
 * @author ryanw
 */
public class CharDisplay extends AbstractDisplay{
    // 需要显示的字符
    private char ch;

    // 构造函数中接收的字符被保存在字段中
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
