package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {

    private String name;
    protected int happiness;                        // 1. megoldás
//    private int happiness;                        // 2. megoldás

    public Dog(String name) {
        this.name = name;
        happiness = 0;
    }

    public abstract void feed();

    public abstract void play(int hours);

    protected void increaseHappiness(int diff) {    // 2. megoldás
        happiness += diff;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }
}
