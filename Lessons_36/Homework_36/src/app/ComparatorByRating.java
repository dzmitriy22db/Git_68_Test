package app;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class ComparatorByRating implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}



