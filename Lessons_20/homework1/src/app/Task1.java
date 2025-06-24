/*
Реализовать программу, которая просит пользователя ввести 5 имен, создает массив с этими именами и выводит их на экран:
Ввод:

jack
jonh
ann
lena
nick
Copy
Вывод:

0.jack
1.jonh
2. ann
3.lena
4.nick

 */

package app;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Вам необходимо будет ввести 5 имен:");



        for(int i = 0; i<names.length; i++) {
            System.out.println(" Введите имя ");
            names[i]=scanner.nextLine();
        }


        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ". " + names[i]);
        }

    }
}
