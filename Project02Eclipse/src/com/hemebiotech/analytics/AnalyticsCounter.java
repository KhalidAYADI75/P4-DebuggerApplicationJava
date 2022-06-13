package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Get the list of symptoms from the file symptoms.txt and set them in the list listeDeSymptomes
 * From the list listeDeSymptomes, count the number of occurences for each symptom and set them in the Map symptomCounter
 * Write the result in the file result.out
 */
public class AnalyticsCounter {
	private List<String> listeDeSymptomes;
	private Map<String, Integer> symptomCounter;
	private final String filePathResult = "Project02Eclipse/result.out";
	public AnalyticsCounter(String filepath) {
		this.listeDeSymptomes = new ReadSymptomDataFromFile(filepath).getSymptoms();
	}

	/**
	 * Count the number of occurences from the list listeDeSymptomes
	 */
	public void countSymptom() {
		Map<String, Integer> symptomCounterMap = new TreeMap<>();
		for (String symptome : listeDeSymptomes) {
			if (symptomCounterMap.containsKey(symptome)) {
				symptomCounterMap.put(symptome, symptomCounterMap.get(symptome) + 1);
			} else {
				symptomCounterMap.put(symptome, 1);
			}
		}
		symptomCounter = symptomCounterMap;
	}

	/**
	 * Write each entry of the Map symptomCounter to the file result.out , one entry per line .
	 */
	public void writeResult() {
		WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile(symptomCounter, filePathResult);
		writeSymptomDataToFile.writeOutputFile();
	}
}