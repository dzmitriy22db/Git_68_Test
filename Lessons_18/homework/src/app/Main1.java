/*

Напишите программу, которая просит пользователя ввести строку и выводит на экран первое слово введенной строке, по-буквам, в столбик. Задачу необходимо реализовать двумя видами цикла из трех.

Например:

hello java

h
e
l
l
o
Copy
Ограничения:

если исходная строка из одного слова, выводим всю строку
слова разделены пробелом
в рамках этой задачи нельзя использовать substring
 */



package app;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите строку: ");
        String inputString = scanner.nextLine();


       for (int index = 0; index < inputString.length(); index++){
           if (inputString.charAt(index) == ' ') {
               break;
           } else {
               System.out.println(inputString.charAt(index));

           }
       }
        }

    }

