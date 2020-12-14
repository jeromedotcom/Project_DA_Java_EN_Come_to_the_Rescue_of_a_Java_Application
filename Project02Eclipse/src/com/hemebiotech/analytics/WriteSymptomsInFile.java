package com.hemebiotech.analytics;

import java.io.IOException;
import java.io.FileWriter;
import java.util.TreeMap;
import java.util.Map;

public class WriteSymptomsInFile implements ISymptomsWriter {

    private final TreeMap<String, Integer> result;

    /**
     * @param result a TreeMap of symptoms as keys with their occurrences as values
     */
    public WriteSymptomsInFile(TreeMap<String, Integer> result) {
        this.result = result;
    }

    @Override
    public void writeSymptoms() {
        try {

            FileWriter writer = new FileWriter("results.out");

            for (Map.Entry<String, Integer> element : result.entrySet()) {
                writer.write(element.getKey() + " : " + element.getValue() + '\n');
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}