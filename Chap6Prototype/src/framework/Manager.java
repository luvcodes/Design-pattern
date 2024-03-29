package framework;

import java.util.HashMap;

/**
 * @author ryanw
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        Product product = (Product) showcase.get(protoname);
        return product.createClone();
    }
}
