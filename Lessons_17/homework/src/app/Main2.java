/*

Напишите программу, которая просит пользователя ввести два числа и выбрать операцию умножить, сложить, умножить или поделить. В качестве результата система должна выводить строку вида:

3 * 3 = 9
Copy
естественно, числа и операция должны зависить от введенных данных.
 */

package app;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите целое первое число: ");
        int userNum1 = scanner.nextInt();

        System.out.println(" Введите целое второе число: ");
        int userNum2 = scanner.nextByte();
        scanner.nextLine();

        System.out.println(" Введите операцию (+, -, /, * : )");
        String userFunktion = scanner.nextLine();


        if (userFunktion.equals("+")) {
            int res1 = userNum1+userNum2;
            System.out.println(" Результат: " + userNum1 +" + " + userNum2 + " = " + res1);
            }
        if (userFunktion.equals("-")) {
            int res2 = userNum1-userNum2;
            System.out.println(" Результат: " + userNum1 +" - " + userNum2 + " = " + res2);
        }
        if (userFunktion.equals("*")) {
            int res3 = userNum1*userNum2;
            System.out.println(" Результат: " + userNum1 +" * " + userNum2 + " = " + res3);
        }
        if (userFunktion.equals("/")) {
            if (userNum2 == 0) {

                System.out.println(" Ошибка!!! Деление на ноль невозможно!!!");
            }else{
                int res4 = userNum1 / userNum2;
                System.out.println(" Результат: " + userNum1 + " / " + userNum2 + " = " + res4);
            }
        }

        }

    }

