package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

import static com.hemebiotech.analytics.Constants.filepathSymptoms;

/**
 *
 * write an alphatical ordered list of symptoms and their occurencies
 */

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {

		// read symptoms from a file
		ReadSymptomsDataFromFile readSymptomsDataFromFile = new ReadSymptomsDataFromFile(filepathSymptoms);
		List<String> symptoms = readSymptomsDataFromFile.getSymptoms();

		// count symptoms
		CountSymptoms countSymptoms = new CountSymptoms(symptoms);
		TreeMap<String, Integer> result =  countSymptoms.count();

		// write symptoms
		WriteSymptomsInFile writeSymptoms = new WriteSymptomsInFile(result);
		writeSymptoms.writeSymptoms();

	}
}
