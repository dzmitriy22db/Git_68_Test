/*
Напишите программу, которая позволяет пользователю вводить целые числа. Как только пользователь введет 0 - считаем что ввод закончен. Программа должна вывести на экран все введенные числа и их сумму

 */

package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        System.out.println("Введите целые числа: (0 для завершения): ");

        while (true){
          int input = scanner.nextInt();
          if (input == 0) {
              break;
          }

            numbers.add(input);
            sum += input;
        }
        System.out.println(" Введенные числа: ");
        for (int number : numbers) {
            System.out.println(number);

        }
        System.out.println("Сумма: " + sum);


    }
}
