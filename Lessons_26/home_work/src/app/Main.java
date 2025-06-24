package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pet pet = inputPet();
    System.out.println(pet);

    }
    public static Pet inputPet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип: ");
        String typPet = scanner.nextLine();
        System.out.println("Введите имя: ");
        String namePet = scanner.nextLine();
        System.out.println("Введите цвет: ");
        String colorPet = scanner.nextLine();
        System.out.println("Введитет возраст: ");
        int birthdayPet = scanner.nextInt();

        Pet pet = new Pet(typPet, namePet, colorPet, birthdayPet);
        return pet;




    }
}
