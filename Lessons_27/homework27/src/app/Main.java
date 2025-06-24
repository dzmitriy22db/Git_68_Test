/*
Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов: title (название), author (автор), genre (жанр), yearOfPublished (год издания). Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры
 */


package app;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Poter", "Joanne Rowling", "Fantasy", 1997 );
        System.out.println(book);
    }

}
