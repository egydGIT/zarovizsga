package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if (s == null) {
            return 0;
        }
        Set<String> justDifferentChar = new HashSet<>();
        if (isMoreWord(s)) {
            String[] array = s.split(" ");                  // ?
            for (int i = 0; i < array.length; i++) {
                justDifferentChar.add(array[i]);
            }
        }
        String[] array = s.split("");
        for (int i = 0; i < s.length(); i++) {
            justDifferentChar.add((array[i]));
        }
        return justDifferentChar.size();
    }

    private boolean isMoreWord(String s) {
        String[] array = s.split(" ");
        if( array.length > 1) {
            return true;
        }
        return false;
    }
}
