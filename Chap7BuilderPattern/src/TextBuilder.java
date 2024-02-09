/**
 * @author ryanw
 */
public class TextBuilder extends Builder{
    // 文档内容保存在该字段中
    private StringBuffer stringBuffer = new StringBuffer();

    // 纯文本的标题
    @Override
    public void makeTitle(String title) {
        stringBuffer.append("=============================");
        stringBuffer.append("[" + title + "]" + "\n");
        stringBuffer.append("\n");
    }

    // 纯文本的字符串
    @Override
    public void makeString(String str) {
        stringBuffer.append('s' + str + "\n");
        stringBuffer.append("\n");
    }

    // 纯文本的条目
    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            stringBuffer.append("  ·" + items[i] + "\n");
        }
        stringBuffer.append("\n");
    }

    // 完成文档
    @Override
    public void close() {
        stringBuffer.append("==============================");
    }

    // 完成的文档
    public String getResult() {
        // 将StringBuffer变换为string
        return stringBuffer.toString();
    }
}
