package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    public Beagle(String name) {
        super(name);
    }

    @Override
    public void feed() {
        happiness += 2;                     // 1. megoldás
//        increaseHappiness(2);             // 2. megoldás
    }

    @Override
    public void play(int hours) {
        happiness += hours * 2;             // 1. megoldás
//        increaseHappiness(hours * 2);     // 2. megoldás
    }
}
