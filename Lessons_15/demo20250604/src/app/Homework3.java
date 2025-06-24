/*
Исходные данные: есть длина и ширина комнаты, площадь паркета в одной упаковке.
Напишите программу, которая запрашивает эти данные у пользователя, сохраняет эти данные
в переменных, вычисляет и выводит в консоль,
сколько упаковок паркета необходимо купить для этой комнаты.

Например:

Длинна комнаты: 4.0
Ширина комнаты: 3.0
В одной упаковке: 3.5 метра

Площадь комнаты 12 м.  необходимо 4 упаковки
Copy
Подсказка: здесь вам может пригодится преобразовать
double - количество упаковок получившееся при расчетах , к int

 */
package app;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner room = new Scanner(System.in);

        System.out.println(" Введите ширину комнаты: ");
        double wightRoom = room.nextDouble();

        System.out.println(" Введите длинну комнаты: ");
        double lenghtRoom = room.nextDouble();

        System.out.println(" Введите площадь паркета в одной упаковки: ");
        double squreParket = room.nextDouble();
        room.nextLine();

        double squreRoom = (wightRoom*lenghtRoom);

        double parket = (squreRoom / squreParket);

        System.out.println(" Площадь вашей комнаты: " + squreRoom + " m2");
        System.out.println(" Необходимо: " + parket + " упаковки.");



    }
}
