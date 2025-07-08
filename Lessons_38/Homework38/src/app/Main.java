package app;

public class Main {
    public static void main(String[] args) {
        Manager<Programmer> manager = new Manager<>();
        manager.addToTeam(new Programmer("Petya"));

        manager.printTeam();
    }


}
