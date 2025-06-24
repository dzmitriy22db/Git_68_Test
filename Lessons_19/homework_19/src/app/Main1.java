/*
Пользователь водит строку. Ваша задача получить новую строку, которая будет состоять из букв исходной, стоящих на нечетных позициях. Например:

Ввод: "java is very easy"
Вывод: "aai eyes"
Copy
или

Ввод: "0123456"
Вывод: "135"

 */


package app;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите строку: ");
        String userString = scanner.nextLine();
//  int n = userString.length()+5;
        // char s = scanner.nextLine().charAt();

        String result = "";
        System.out.println(result + "  длинна result " + Integer.toString(result.length()));
        for (int i = 1; i <  userString.length() ;  i+=2 ){
            result += userString.charAt(i);
            System.out.println(result + "  длинна result " + Integer.toString(result.length()));

        }

        System.out.println("Результат: " + result);



    }
}
