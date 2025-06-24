/*
Исходные данные программы:

имя
отчество
фамилия
Создайте переменные для этих данных. После чего сформируйте строке вида:

Николай Иванович Петров (Н.И. Петров)
Copy
Подсказка: что бы получить инициалы, используйте charAt как мы делали на занятие

 */

package app;

public class Task1 {
    public static void main(String[] args) {
        String name1 =  "Николай";
        String name2 =  "Иванович";
        String name3 =  "Петров";

        String nameString = name1+ " " + name2 + " " + name3
                + " (" + name1.charAt(0) + "." + name2.charAt(0) + ". " + name3 +")";

        System.out.println(nameString);
    }
}
