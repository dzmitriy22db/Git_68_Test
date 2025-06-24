package app;

public class Main3 {
    public static void main(String[] args) {
        int[] massiv1 = {1,3,2,-1};
        int[] massiv2 = {16,4,2,-1,8,16,19};
        int[] massiv3 = {-1,2};

        printArr(massiv1);
        System.out.println("---------------------");
        printArr(massiv2);
        System.out.println("---------------------");
        printArr(massiv3);
        System.out.println("-----------------------");

        System.out.println("сумма первого массива");
        long sum1 = sumArray(massiv1);
        System.out.println(sum1);

        System.out.println("сумма второго массива");
        long sum2 = sumArray(massiv2);
        System.out.println(sum2);

        System.out.println( temp("hello", 3) ) ;
        System.out.println( temp("java world", 1) ) ;



    }


    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "  | ");
        }
        System.out.println();
    }

    public static long sumArray(int[] arr){
        long result = 0;
        for (int i=0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }

    public static String temp(String str, int a ){
        return a + " " + str + " " + a;
    }





}



