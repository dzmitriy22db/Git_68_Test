package app;
/*
### Задача 2
Напишите программу, которая просит пользователя ввести два числа
и выбрать операцию умножить, сложить, умножить или поделить.
В качестве результата система должна выводить строку вида:
~~~
3 * 3 = 9
~~~
естественно, числа и операция должны зависеть от введенных данных.

 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите операцию:");
        String operation = scanner.nextLine();

        int result = 0;
        // -----------------------------------------
        switch (operation){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2!=0) {
                    result = num1 / num2;
                } else {
                    System.out.println("на 0 делить нельзя!");
                }
                break;
            default:
                System.out.println("Ошибка ввода");
                break;
        }

        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

    }




}

