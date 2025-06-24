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

public class Main {
    public static void main(String[] args) {
        String str = "Николай Иванович Петров ";
        System.out.println(str);
        String myString = "Николай Иванович Петров ";
        System.out.println("(" + myString.charAt(0) +"."+  myString.charAt(8) +"."+ " Петров)");



    }
}




