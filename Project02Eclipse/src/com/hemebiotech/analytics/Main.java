package com.hemebiotech.analytics;

/**
 * Get the list of symptoms in the file symptoms.txt
 * Count the number of occurences for each symptom
 * Write the result in the file result.out
 */
public class Main {
    public static void main(String args[]) throws Exception {
        AnalyticsCounter analyticsCounter = new AnalyticsCounter("Project02Eclipse/symptoms.txt");
        analyticsCounter.countSymptom();
        analyticsCounter.writeResult();
    }
}
