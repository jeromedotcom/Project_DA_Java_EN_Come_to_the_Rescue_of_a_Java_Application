package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 *
 * count occurences of each symptoms from 'symptoms' and put them in a TreeMap 'result'
 */

public class CountSymptoms {
    private final List<String> symptoms;

    /**
     *
     * @param symptoms a row listing of all symptoms
     */
    public CountSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    /**
     *
     * @return a TreeMap 'result' with symptoms and their occurrences ordered alphabetically
     */
    public TreeMap<String, Integer> count() {

        TreeMap<String, Integer> result = new TreeMap<>();
        int numberOfOccurencies;

        for (String symptom : symptoms) {
            if (result.containsKey(symptom)) {
                numberOfOccurencies = result.get(symptom);
                numberOfOccurencies++;

            } else {
                numberOfOccurencies = 1;
            }
            result.put(symptom, numberOfOccurencies);
        }
        return result;
    }


}