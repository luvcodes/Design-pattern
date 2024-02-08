package ThirdVersion;

/**
 * @author ryanw
 */
public interface Product extends Cloneable {
    abstract Product clone();
    abstract void printProduct();
}
