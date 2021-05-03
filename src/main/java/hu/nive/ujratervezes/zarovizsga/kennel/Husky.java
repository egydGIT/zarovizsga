package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog {

    public Husky(String name) {
        super(name);
    }

    @Override
    public void feed() {
        happiness += 4;                     // 1. megoldás
//        increaseHappiness(4);             // 2. megoldás
    }

    @Override
    public void play(int hours) {
        happiness += hours * 3;             // 1. megoldás
//        increaseHappiness(hours * 3);     // 2. megoldás
    }
}
