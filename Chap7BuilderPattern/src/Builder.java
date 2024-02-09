/**
 * @author ryanw
 */
public abstract class Builder {
    // 编写标题、字符串、条目
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    // 完成文档编写的方法
    public abstract void close();
}
