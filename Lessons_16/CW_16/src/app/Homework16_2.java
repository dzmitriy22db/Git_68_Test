/*
В программе заданно 2 переменных: adminLogin и adminPass.
Пользователь вводит свои логин и пароль. Если введенные логин и пароль совпадают
с adminLogin и adminPass, программа выдает сообщение: "доступ возможен", иначе "вы не опознаны"

 */

package app;

import java.util.Scanner;

public class Homework16_2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println(" Введите логин: ");
        String userLog = scanner.nextLine();

        System.out.println(" Введите пароль: ");
        int userPas = scanner.nextInt();

        String correktLog = "qwert";
        int correktPas = 12345;


        boolean userDisplay = userLog.equals(correktLog) && userPas == correktPas;
        if(userDisplay){
            System.out.println("Привет пользователь");
        }else{
            System.out.println("Логин или пароль введены неправильно");
        }



    }
}
