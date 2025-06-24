/*
Написать метод, который создает и возвращает новый массив который является копией исходного, но в обратном порядке {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}

 */

package app;

public class Task1 {
    public static void main(String[] args) {
       int[] arrAy = {10, 3, 3, 5, 7, 9,18,19, -9};
        printArray(arrAy);
        arrAy = copyArr(arrAy);
        printArray(arrAy);



    }
    public static int[] copyArr(int[] arrName){
       int[] newCopy = new int[arrName.length];
        for (int i = 0; i < arrName.length ; i++) {

            newCopy[i] = arrName[arrName.length-1-i];
        }
        return newCopy;


    }
    public static void printArray(int[] arrName){
        for (int i = 0; i < arrName.length; i++) {
            System.out.print(arrName[i] + ", " );

        }
        System.out.println();

    }

}

