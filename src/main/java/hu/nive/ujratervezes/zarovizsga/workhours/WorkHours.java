package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WorkHours {

    public String minWork(String file) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {   // BufferedReader
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
            if (workHours < min) {
                min = workHours;
                result = array[0] + ": " + array[2];
            }
        }
        return result;
    }


    public String minWork2(String file) {                                       // Files.readAllLines()
        try {
            List<String> lines = Files.readAllLines(Path.of(file));

            return findMin(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String findMin(List<String> lines) {
        String result = null;
        int minHours = 25;
        for (String line : lines) {
            String[] parts = line.split(",");
            String name = parts[0];
            int hours = Integer.parseInt(parts[1]);
            String date = parts[2];

            if (minHours > hours) {
                minHours = hours;
                result = name + ": " + date;
            }
        }
        return result;
    }

}

