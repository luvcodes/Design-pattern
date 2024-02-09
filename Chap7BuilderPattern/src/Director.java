/**
 * @author ryanw
 */
public class Director {
    private Builder builder;

    // 这里的参数实际上是Builder类的子类
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greetings");
        builder.makeString("从早上至下午");
        builder.makeItems(new String[] {
                "早上好。",
                "下午好。"
        });
        // 其它字符串
        builder.makeString("晚上");
        builder.makeItems(new String[] {
                "晚上好。",
                "晚安",
                "再见"
        });
        // 完成文档
        builder.close();
    }


}
