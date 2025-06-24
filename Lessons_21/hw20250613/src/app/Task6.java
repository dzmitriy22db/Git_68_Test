package app;
// создать копию заданного массива скопировав только элементы, которые делятся на 3
public class Task6 {
    public static void main(String[] args) {
        int[] arr = {10,-3,0,21,2,0,7,3,9};

        int counter = 0; // сколько элементов исходного массива делятся на 3
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 3 == 0){
                counter++;
            }
        }
        // посчитали в counter сколько элементов исходного массива делятся на 3

        int[] arrCopy = new int[counter];
        System.out.println("Количество элементов, которые делятся на 3: " + counter);


        // копирование элементов из arr в arrCopy
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0){
                arrCopy[j] = arr[i];
                j++;
            }
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
        System.out.println("массив копия:");
        for (int i = 0; i < arrCopy.length ; i++) {
            System.out.print(arrCopy[i] + "   ");
        }


    }
}

