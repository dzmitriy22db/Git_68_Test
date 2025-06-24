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

public class Main2 {
    public static void main(String[] args) {
        String fullName = "Николай Иванович Петров";

        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");



        String s1 = "Имя: " + fullName.substring(0,8);
        System.out.println(s1);
        String s2 = "Отчество: " + fullName.substring(8,16);
        System.out.println(s2);
        String s3 = "Фамилия: " + fullName.substring(16,23);
        System.out.println(s3);

    }


}
