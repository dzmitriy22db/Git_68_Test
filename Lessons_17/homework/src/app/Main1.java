/*

Напишите программу, которая просит пользователя ввести номер месяца и выводит название введенного месяца:

Введите номер месяца:
3
Месяц номер 3: март

 */

package app;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        System.out.println(" Введите номер месяца от 1 до 12: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1: System.out.println(" Месяц номер 1: Январь "); break;
            case 2: System.out.println(" Месяц номер 2: Февраль "); break;
            case 3: System.out.println(" Месяц номер 3: Март "); break;
            case 4: System.out.println(" Месяц номер 4: Апрель "); break;
            case 5: System.out.println(" Месяц номер 5: Май "); break;
            case 6: System.out.println(" Месяц номер 6: Июнь "); break;
            case 7: System.out.println(" Месяц номер 7: Июль "); break;
            case 8: System.out.println(" Месяц номер 8: Август "); break;
            case 9: System.out.println(" Месяц номер 9: Сентябрь "); break;
            case 10: System.out.println(" Месяц номер 10: Октябрь "); break;
            case 11: System.out.println(" Месяц номер 11: Ноябрь "); break;
            case 12: System.out.println(" Месяц номер 12: Декабрь "); break;
            default:
                System.out.println(" Такого номера месяца не существует");



        }
        }




    }


