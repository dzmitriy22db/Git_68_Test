/*
Напишите метод void printDate(int day, int month, int year) который получает 3 значения int и выводит на экран дату, следующем виде:

год месяц число
Copy
Например:

printDate(15,1,2008)
Вывод: 2008 январь 15
Copy
в рамках данной задачи предполагаем, что данные корректны

 */

package app;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день: ");
        int dayUser = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int monthUser = scanner.nextInt();
        System.out.println("Введите год: ");
        int yearUser = scanner.nextInt();



       printDate(dayUser,monthUser,yearUser);

    }
    public static void printDate(int day, int month, int year){
       String[] months  = {" Январь ", " Февраль ", " Март ", " Апрель ", " Май ", " Июнь ", " Июль ", " Август ", " Сентябрь ", " Октябрь ", " Ноябрь ", " Декабрь "};

        System.out.println(year + months[month-1] + day);

    }
}
