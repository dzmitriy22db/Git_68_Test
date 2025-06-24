/*
Дано: Массив double из 12 значений - каждое значение доход от продаж за соответствующий месяц. Ваша задача:

посчитать доход за весь год
найти месяц (номер месяца) с самым большим доходом

 */




package app;

public class Main1 {
    public static void main(String[] args) {

        double[] number = {153, 18, 19, 21, 10.5, 5, 7, 56, 318, 418, 515, 15 };
        double summaAll = 0;
        double max=number[0];
        int counter = 0;


        for(int i=0; i < number.length; i++){
            summaAll += number[i];

            {
                if (number[i] > max) {
                    max = number[i];
                    counter=i;

                }

             }



        }

        System.out.println(" Доход за весь год составил: " + summaAll + " Euro");
        System.out.println(" Самый доходный месяц " + counter + " составил: " + max);


    }
}
