package app;

public class BackEndProgrammer extends Programmer{
    private String name;

    public BackEndProgrammer(String name, String name1) {
        super(name);
        this.name = name1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BackEndProgrammer{}";
    }
}
