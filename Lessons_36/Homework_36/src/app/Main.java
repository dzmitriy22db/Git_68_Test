/*
Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование, цена, рейтинг, количество штук на складе и т.д.
Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары и, в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например, по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).
Для этого, очевидно, можно использовать метод Collection.sort и реализовать несколько Comparator<Person>

 */

package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Product> product = new ArrayList<>();

        product.add(new Product("Milk", 1.25, 5.0, 50));
        product.add(new Product("Kaffe", 14.5, 4.1, 70));
        product.add(new Product("Tee", 0.89, 4.3, 40));
        product.add(new Product("Yogurt", 1.75, 4.5, 150));
        product.add(new Product("Sugar", 0.99, 3.9, 100));
        product.add(new Product("Paprika", 1.45, 2.5, 60));
        product.add(new Product("Lemon", 1.27, 3.4, 57));

        for (Product p : product){
            System.out.println(p);
        }

        System.out.println("============RATING============");

        Collections.sort(product, new ComparatorByRating());
        System.out.println(" Отсортированно по рейтингу ");

        for (Product p : product){
            System.out.println(p);
        }

        System.out.println("===========PRICE=============");

        Collections.sort(product, new ComparatorByPrice());
        System.out.println(" Отсортированно по цене ");

        for (Product p: product){
            System.out.println(p);
        }

        System.out.println("==========NAME================");

        Collections.sort(product, new ComparatorByName());
        System.out.println(" Отсортированно по наименованию ");

        for (Product p: product) {
            System.out.println(p);
        }


        System.out.println("===========QUANTITY===============");

        Collections.sort(product, new ComparatorByQuantity());
        System.out.println(" Отсортированно по цене ");

        for (Product p: product){
            System.out.println(p);
        }



    }
}
