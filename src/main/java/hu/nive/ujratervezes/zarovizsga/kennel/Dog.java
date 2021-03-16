package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {

    private String name;
    protected int happiness;

    public Dog(String name) {
        this.name = name;
        happiness = 0;
    }

    abstract void feed();

    abstract void play(int hours);

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }
}
