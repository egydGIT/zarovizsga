package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
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

    public void playWith(String name, int hours) {
//        for (Dog dog: dogs) {
//            if(dog.getName().equalsIgnoreCase(name)) {
//                dog.play(hours);
//            }
//        }
        Dog dog = findByName(name);                          // kódismétlés helyett met. felhasználás!
        dog.play(hours);

    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> names = new ArrayList<>();
        for (Dog dog: dogs) {
            if ( dog.getHappiness() > minHappiness ) {
                names.add(dog.getName());
            }
        }
        return names;
    }
}
