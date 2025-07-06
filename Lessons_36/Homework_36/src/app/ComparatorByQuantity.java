package app;

import java.util.Comparator;

public class ComparatorByQuantity implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
