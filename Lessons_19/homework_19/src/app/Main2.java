/*
Пользователь водит целое число. Ваша задача определить, является ли жто число простым. Напомню, простое число это то, которое без остатка делится только на 1 и на само себя, иными словами, не делится ни на какое число больше. Например:

5 простое делится только на 1 и на 5
6 не простое делится на 1, 2, 3 и 6

 */


package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите целое число: ");
        int userNum = scanner.nextInt();
        int i;
        String s = "";
        // поиск делителей для введенного пользователем числа, перебор с 2 до userNum-1
        for(i=2; i < userNum; i++ ){
            // проверяем делиться число userNum на целое число i
            if((userNum % i) ==0){
                // число userName делится на i сохраняем в строке s этот делитель
                s  += (Integer.toString(i)+ " \n");

                // break;
            }

        }
        // проверяем были ли найдены делители кроме 1 и userName
        if(s == "" ){
            System.out.println(" Число является простым: ");
        }
        else {
            System.out.println(" число является не простым, у него есть делители: \n" + s);
        }

    }
}
