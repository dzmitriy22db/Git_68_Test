package app;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        BankAccount account1 = new BankAccount("DE12341234",
                1000,
                new Person("Jack","Jackson", new MyDate(10, 2,2008) ),
                new MyDate(20,6,2024));

        BankAccount account2 = new BankAccount("DE88888888",
                1000,
                new Person("Oleg","Olegov", new MyDate(1, 11,2003) ),
                new MyDate(20,6,2024));


        BankAccount[] accountsArr = {account1,account2,
                new BankAccount("DE12345678",10353.3, new Person("Nick","White", new MyDate(10,3,1993)),new MyDate(12,12,2024))  };



        for (int i = 0; i < accountsArr.length ; i++) {
            System.out.println(accountsArr[i]);
        }
        System.out.println("------------------");
        account1.iban = "1234567890-=";
        System.out.println(accountsArr[0]);






    }








}

/*
Создайте классы MyData и Person по примеру того, как это было на занятие.
Создайте класс BankAccount (банковский счет) со следующими полями
- String iban - номер счета
- double balance - баланс счета
- Person owner - владелец счета
- MyDate open - дата открытия
Вам необходимо создать конструктор и затем создать в программе несколько объектов банковских счетов
Необходимо написать метод, который формирует строку с информацией о счете, например, такого вида:
~~~
"DE123412341234  Н.Петров (19/10/1987) Счет открыт: 1/2/2025  Баланс 10345.10"
~~
 */
