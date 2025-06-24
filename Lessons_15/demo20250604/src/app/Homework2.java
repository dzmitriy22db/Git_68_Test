/*
Ваша программа должна (используя Scanner) запросить

имя первого пассажира
количество груза первого пассажира (целое число)
имя второго пассажира
количество груза первого пассажира (целое число)
Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:

Пассажир 1: имя, багаж: xxx
Пассажир 2: имя, багаж: xxx
Всего багажа: yyy
Copy
Естественно, в результат должны подставится введенные данные.

 */

package app;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите имя первого пассажира: ");
        String namePassenger1 = scanner.nextLine();


        System.out.println(" Введите количество груза: ");
        int baggage = scanner.nextInt();
        scanner.nextLine();


        System.out.println(" Введите имя второго пассажира: ");
        String namePassenger2 = scanner.nextLine();

        System.out.println(" Введите количество груза второго пассажира: ");
        int baggage2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Пассажир 1: " + namePassenger1 +","+ " количество багажа: " + baggage);
        System.out.println(" Пассажир 2: " + namePassenger2 +","+ " количество багажа: " + baggage2);
        System.out.println(" Всего багажа: " + (baggage + baggage2));





    }
}
