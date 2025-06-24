package app;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите длину комнаты: ");
        double length = scanner.nextDouble();

        System.out.println(" Введите ширину комнаты: ");
        double wigth = scanner.nextDouble();

        System.out.println(" Введите площадь паркета в одной упаковке: ");
        double areInBox = scanner.nextDouble();

        double roomArea =length * wigth;
        //int boxForBuy = (int)(roomArea/areInBox+0.9);
        int boxForBuy = (int)Math.ceil(roomArea/areInBox);
        System.out.println(" Площадь комнаты: " + roomArea);
        System.out.println(" Вем необходимо " + boxForBuy + " упаковок");
    }
}
