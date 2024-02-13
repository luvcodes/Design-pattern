package idcard;

import framework.Factory;
import framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ryanw
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }
    public List getOwner() {
        return owners;
    }
}
