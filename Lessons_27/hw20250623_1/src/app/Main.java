package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        Pet[] petArray = createPetArray(size);
        printArr(petArray);
        printInfoByType(petArray,"собака");
    }

    public static Pet inputPet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип:");
        String type = scanner.nextLine();
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите цвет:");
        String color = scanner.nextLine();
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        return new Pet(type, name, color, age);
    }


    public static Pet[] createPetArray(int size){
        Pet[] arr = new Pet[size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Вводим питомца №"+(i+1));
            arr[i] = inputPet();
            System.out.println("Pet: " + arr[i]);
            System.out.println("----------------------");
        }

        return arr;

    }

    public static void printArr(Pet[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printInfoByType (Pet[] arr, String type){
        int count = 0;
        int sumAges = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].type.equals(type)){
                count++;
                sumAges+=arr[i].age;
            }
        }

        if (count==0){
            System.out.println("Животных с типом " + type + " нет в базе");
        } else {
            System.out.println("Животных с типом " + type + ": " + count );
            System.out.println("Средний возраст: " + ((double)sumAges/count));
        }


    }


}


/*
## Задача 1
Давайте представим, что мы пишем программу для ветеринарной клиники.
Создайте класс Pet(Домашнее животное)
Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст
Реализуйте конструктор, toString()
Реализуйте метод, который позволяет создать объект Pet используя Scanner

### Задача 2
Используя написанные в задаче 1 классы и методы напишите программу, которая позволяет
ввести несколько домашних животных и формирует из них массив.
Выведите этот массив на экран.

### Задача 3 (по желанию)
реализуйте метод (или методы), которые позволят получить статистику по базе животных:
пользователь вводит тип животного, например "собака", программа должна вывести количество
собак в массиве и их средний возраст.



 */

