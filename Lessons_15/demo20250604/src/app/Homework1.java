/*
Ваша программа должна (используя Scanner) запросить

возраст пользователя
имя пользователя
Именно в таком порядке, сначало возраст потом имя.
Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:

Jack (20)
Copy
Естественно, в результат должны подставится введенные данные.
 */

package app;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        String str1 =  scanner.nextLine();
        //System.out.println(str1);

        System.out.println("Введите ваше имя: ");
        String str2 = scanner.nextLine();
        //System.out.println(str2);
        System.out.println(" Привет " + str2 + " (" + str1 +") ");


    }
}
