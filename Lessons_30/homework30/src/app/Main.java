/*
Предположим, у вас есть программа для учета различных видов транспортных средств в автопарке.
У вас есть базовый класс Vehicle, который представляет общую информацию о транспортном средстве, такую как номер (number), марка (brand)  и год выпуска (year).
Создайте подклассы для различных типов транспортных средств, таких как Car, Truck, Bus и т. д.
В каждом Truck, Bus добавьте дополнительные свойства, специфичные для данного типа транспортного средства. Например, для Truck - грузоподъемность (loadCapacity),  для Bus - кол-во пассажиров (numberOfSeats or numberOfPassenger).
Создайте метод drive() который выводит на экран номер транспортного средства и слово 'поехали'.Кроме этого, в случае Truck - метод должен выводить запись о том, что перевозим столько то тонн груза, а в случае Bus - столько то пассажиров.
В main создайте список транспортных средств и каждое "отправьте в поездку" т.е. drive()

 */

package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("7734 RS", "Mercedes", 2015));
        vehicles.add(new Truck("2456 LB","Volvo", 2018, 12.5));
        vehicles.add(new Bus("2890 FZ", "Mann", 2020, 28));

        for(Vehicle vehicle : vehicles ){
            vehicle.drive();

        }

    }
}
