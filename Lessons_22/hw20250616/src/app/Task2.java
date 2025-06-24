package app;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Olga","Oleg","Svetlana","Oleg"};
        int[] yearsOfBirthday = {2004,1982,2008,2010};
        int ageLimit = 15;
        int year = 2025;

        int indexMin = 0; // номер минимального года в массиве yearsOfBirthday


        for (int i = 0; i < names.length ; i++) {
            int age = year - yearsOfBirthday[i];
            if (age > ageLimit) {
                System.out.println(names[i] + "(" + age + ")");
            }

            if (yearsOfBirthday[indexMin] > yearsOfBirthday[i]){
                indexMin = i;
            }

        }
        System.out.println("---------------------------------------");
        System.out.println("Самый старший: " + names[indexMin] + "(" + yearsOfBirthday[indexMin] + ")");


    }
}

/*
Дано два массива String[] names и int[ ] yearsOfBirthday одинаковой длинны, которые
соответственно содержат имена и годы рождения людей. Каждый элемент в yearsOfBirthday
соответствует элементу с таким же индексом в names. Реализовать программу, которая распечатает
список людей (имя плюс возраст) , которые старше заданного int. Потом распечатать имя и возраст
старейшего:
Например:
~~~
{“Olga”,”Oleg”,”Svetlana”,”Oleg”}
{2004,1982,2008,”2010”}
15
~~~
результат:
~~~
Olga 16 years
Oleg 38 years
_____________
Oleg 38 years is oldest
~~~



 */
