public class Auto {
    private int id;
    private String brand;
    private int year;
    private int preis;

    public Auto(int id, String brand, int year, int preis) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.preis = preis;


    }
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return "Auto: " +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", preis=" + preis;
    }
}
