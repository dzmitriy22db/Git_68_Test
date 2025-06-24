/*
Обратная задача. Исходные данные программы: строка вида

Николай Иванович Петров
Copy
Написать программу, которая рахбирает строку на три переменные:

имя
отчество
фамилия
Подсказка: Вам понадобятся методы строки indexOf(), lastIndexOf и substring()

 */

package app;

public class Task2 {
    public static void main(String[] args) {

        String fullNameString = "Николай Иванович Петров";

        //---------
        int firstSpace = fullNameString.indexOf(" "); // нашли индедкс первого пробела
        int lastSpace = fullNameString.lastIndexOf(" "); // нашли индедкс последнего пробела
        String name1 = fullNameString.substring(0,firstSpace);
        String name2 = fullNameString.substring(firstSpace+1,lastSpace);
        String name3 = fullNameString.substring(lastSpace+1);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }

}
