package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Book> book = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Book title name: ");
        String inputTitle = scanner.nextLine();

        System.out.println(" Author: ");
        String inputAuthor = scanner.nextLine();

        Book userBook = new Book(inputTitle, inputAuthor);




        book.add(new Book("Die Verwandlung", "Franz Kafka"));
        book.add(new Book("Faust", "Johann Wolfgang von Goethe" ));
        book.add(new Book("Die unendliche Geschichte", " Michael Ende"));
        book.add(new Book("Faust", "Johann Wolfgang von Goethe" ));
        book.add(new Book("Die Verwandlung", "Franz Kafka"));

         int count = countOccurrences(book, userBook);
    }
    public static int countOccurrences(List<Book>books, Book targetBook){
        int count = 0;
        for (Book b : books) {
            if (b.equals(targetBook)){
                count++;
            }
        }
        System.out.println(" Книга встречается: " + count + " раз");
        return  count;

    }

}
