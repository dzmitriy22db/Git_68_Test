import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Auto> list = new ArrayList<>();
        list.add(new Auto(1234, "Mercedes", 2020, 18000));
        list.add(new Auto(2984, "BMW", 2024, 14000));
        list.add(new Auto(8934, "Opel", 2023, 19000));
        list.add(new Auto(1938, "Audi", 2021, 22000));
        list.add(new Auto(4892, "VW", 2022, 13000));


        System.out.println("-------------По цене---------");
        list.sort((a1,a2)-> Integer.compare(a1.getPreis(), a2.getPreis()));
        for(Auto a : list){
            System.out.println(a);
        }

        System.out.println("-----------По ID-------------");


        list.sort((a1,a2) -> Integer.compare(a1.getId(), a2.getId()));
        for (Auto a : list){
            System.out.println(a);

        }

        System.out.println("-----------По году-------------");

        list.sort((a1,a2)-> Integer.compare(a1.getYear(), a2.getYear()));
        for (Auto a : list){
            System.out.println(a);
        }

        System.out.println("----------По Брэнду-------------");

        list.sort((a1,a2)-> a1.getBrand().compareTo(a2.getBrand()));
        for (Auto a : list){
            System.out.println(a);
        }

    }
}
