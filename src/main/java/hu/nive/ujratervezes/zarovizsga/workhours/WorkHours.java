package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkHours {

    public String minWork(String file) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
            return findResult(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String findResult(BufferedReader reader) throws IOException {
        String result = "";
        String line;
        int min = Integer.MAX_VALUE;
        while ((line = reader.readLine())  != null) {
            String[] array = line.split(",");
            int workHours = Integer.parseInt(array[1]);
            if ( workHours < min) {
                min = workHours;
                result = array[0] + ": " + array[2];
            }
        }
        return result;
    }
}


/*
            Map<Integer, String> results = new HashMap<>();
            results.put(workHours, line);
            int min = Integer.MAX_VALUE;
            for (Map.Entry entry: results.entrySet()) {
                if ( > min) {
                }
            }
 */