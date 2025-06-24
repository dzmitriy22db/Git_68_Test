/*
Дано два массива String[] names и int[ ] yearsOfBirthday одинаковой длинны, которые соответственно содержат имена и годы рождения людей. Каждый элемент в yearsOfBirthday соответствует элементу с таким же индексом в names. Реализовать программу, которая распечатает список людей (имя плюс возраст) , которые старше заданного int. Потом распечатать имя и возраст старейшего: Например:

{“Olga”,”Oleg”,”Svetlana”,”Oleg”}
{2004,1982,2008,”2010”}
15
Copy
результат:

Olga 16 years
Oleg 38 years
_____________
Oleg 38 years is oldest

 */


package app;

public class Main2 {
    public static void main(String[] args) {
        String[] names = {"Olga","Oleg", "Svetlana", "Oleg"};
        int[] yearsOfBirthday = {2004, 1982, 2008, 2010};

        for (int i=0;i< names.length; i++){
            System.out.print("  " + names[i] );
        }

    }
}
