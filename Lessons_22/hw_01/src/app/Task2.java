/*
Напишите два метода,

int minIndex(int[] arr) метод который получает массив, а возращает индекс минимального элемента в этом массиве
int maxIndex(int[] arr) метод который получает массив, а возращает индекс максимального элемента в этом массиве Используя эти два метода, напишите программу, которая меняет местами минимальный элемент массива с максимальным элементом массива.

 */

package app;

public class Task2 {
    public static void main(String[] args) {
        int[] dima = {2,5,7,8,13,-9,8,7};

        System.out.println(" Минимальное значение находится по индексу: " + minIndex(dima));

        System.out.println(" Максимальное значение находится по индексу: " + maxIndex(dima));
        System.out.println(" Максимальное значение находится по индексу: " + minMaxIndex(dima)[1]);



    }
    public static int minIndex(int[] arr){

        int minInd;
        if(arr.length == 0) return(-1);

        minInd = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[minInd]){
                minInd = i;
            }
        }
        return(minInd);
    }
    public static int[] minMaxIndex(int[] arr){

        int[] ind= new int[2];


        ind[0] = ind[1] = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[ind[0]]){
                ind[0] = i;
            }
            if(arr[i]>arr[ind[1]]){
                ind[1] = i;
            }
        }
        return(ind);
    }
    public static int maxIndex(int[] arr){

        int maxInd;
        if(arr.length == 0) return(-1);

        maxInd = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[maxInd]){
                maxInd = i;
            }
        }
        return(maxInd);
    }
}
