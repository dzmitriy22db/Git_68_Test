package app;

import exception.NotCorrectEmailFormatException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String email = getEmailFromUser();
            System.out.println(" email принят: " + email);
        }  catch (NotCorrectEmailFormatException e) {
            System.out.println(" Ошибка: " + e.getMessage());
        }


    }

    public static String getEmailFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите ваш  email: ");
        String email = scanner.nextLine();

        if (email.length() < 5 ||
                !email.contains("@") ||
                email.indexOf("@") != email.lastIndexOf("@") ||
                email.startsWith("@") ||
                email.endsWith("@")) {

            throw new NotCorrectEmailFormatException(" Неправильный фотрмат email: " + email);
        }
        return email;


    }
}

