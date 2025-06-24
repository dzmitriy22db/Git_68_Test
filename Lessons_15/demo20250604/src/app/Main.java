package app;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создаем объект Scanner для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str1 = scanner.nextLine();

        System.out.println("Вы ввели: " + str1);

        System.out.println("Введите целое число: ");
        int intValue1 = scanner.nextInt();
        System.out.println(" Вы ввели: " + intValue1);
        System.out.println("Введите целое второе число: ");
        int intValue2 = scanner.nextInt();

        System.out.println(" Вы ввели: " + intValue1);
        System.out.println(" Вы ввели: " + intValue2);
        System.out.println(" Сумма: " + (intValue1 + intValue2));

        System.out.println("Введите дробное число: ");
        double dbValue = scanner.nextDouble();
        System.out.println("Вы ввели: " + dbValue); //10.5

    }
}
