package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {                 // hány kül számjegy
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                chars.add(c);
            }
        }
        return chars.size();
    }

    public int getCountOfDifferentCharacters(String s) {    // hány kül karakter, akkor is, ha szóköz van
        if (s == null || s.equals("")) {
            return 0;
        }
        Set<String> justDifferentChar = new HashSet<>();
        String[] array = s.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(" ")) {
                continue;
            }
            justDifferentChar.add((array[i]));
        }
        return justDifferentChar.size();
    }
}
