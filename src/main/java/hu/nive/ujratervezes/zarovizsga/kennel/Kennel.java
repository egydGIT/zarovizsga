package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    void addDog(Dog dog) {
        dogs.add(dog);
    }

    void feedAll() {
        for (Dog dog: dogs) {
            dog.feed();
        }
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public Dog findByName(String name) {
        for ( Dog dog: dogs) {
            if (dog.getName().equalsIgnoreCase(name)) {
                return dog;
            }
        }
        throw new IllegalArgumentException("Cant find dog with this name: " + name);
    }
}
