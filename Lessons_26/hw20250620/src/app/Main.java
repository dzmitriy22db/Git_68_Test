package app;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MyDate birthday1 = new MyDate(10, 2,2008);
        Person person1 = new Person("Jack","Jackson", birthday1);
        MyDate accOpen1 = new MyDate(20,6,2024);
        BankAccount account1 = new BankAccount("DE12341234",1000,person1,accOpen1);
        printAccount(account1);
    }

    // "DE123412341234  Н.Петров (19/10/1987) Счет открыт: 1/2/2025  Баланс 10345.10"
    public static void printAccount(BankAccount account){
        System.out.println(account.iban + " " + personToString(account.owner) +
                " Счет открыт: " + dateToString(account.open) + " Баланс: " + account.balance  );
    }

    public static String personToString(Person person){
        return person.firstName.charAt(0) + ". " + person.lastName
                + " (" + dateToString(person.birthday) + ")";
    }

    public static String dateToString(MyDate date){
        return date.day + "/" + date.month + "/" + date.year;
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


