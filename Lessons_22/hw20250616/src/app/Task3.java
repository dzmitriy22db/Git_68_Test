package app;

public class Task3 {

    public static void main(String[] args) {
        int[] arr = {10,5,-1,4,14};

        // вывод на экран массива
        for (int i  = 0; i  < arr.length ; i ++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        // ищем индекс минимального элемента ( c 0 ... )
        int indexMin = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < arr[indexMin] ){
                indexMin = i;
            }
        }

        // переставляем элемент 0 с элементом с индексом indexMin
        int temp = arr[0];
        arr[0] = arr[indexMin];
        arr[indexMin] = temp;


        // выводим на экран массив
        for (int i  = 0; i  < arr.length ; i ++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        // ищем индекс минимального элемента ( c 1 ... )
        indexMin = 1;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < arr[indexMin] ){
                indexMin = i;
            }
        }

        // переставляем элемент 1 с элементом с индексом indexMin
        temp = arr[1];
        arr[1] = arr[indexMin];
        arr[indexMin] = temp;

        // выводим на экран массив
        for (int i  = 0; i  < arr.length ; i ++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();


    }

}

/*
Дан массив int. Написать программу, которыя ищет самый маленький элемент массива и меняет его с первым
элементам (т.е. с элементом с индексом 0) Потом меняет местами второй самый маленький элемент
с элементом с индексом 1. Например:
Например: {10,5,-1,4,14} -> {-1,4,10,5,14}
*/
