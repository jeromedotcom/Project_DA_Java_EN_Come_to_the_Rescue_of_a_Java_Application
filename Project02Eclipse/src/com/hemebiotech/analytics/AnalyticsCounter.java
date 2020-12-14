package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 *
 * write an alphatical ordered list of symptoms and their occurencies
 */

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {

		// read symptoms from a file
		String filepath = "Project02Eclipse/symptoms.txt";
		ReadSymptomsDataFromFile readSymptomsDataFromFile = new ReadSymptomsDataFromFile(filepath);
		List<String> symptoms = readSymptomsDataFromFile.getSymptoms();

		// count symptoms
		CountSymptoms countSymptoms = new CountSymptoms(symptoms);
		TreeMap<String, Integer> result =  countSymptoms.count();

		// write symptoms
		WriteSymptomsInFile writeSymptoms = new WriteSymptomsInFile(result);
		writeSymptoms.writeSymptoms();

	}
}
