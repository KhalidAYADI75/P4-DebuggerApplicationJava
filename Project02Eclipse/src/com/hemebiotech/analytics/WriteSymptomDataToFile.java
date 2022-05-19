package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * class that handle the writing in the result file
 */

public class WriteSymptomDataToFile implements SymptomWriter {

    private final Map<String, Integer> symptoms;
    private final String filepath;

    /**
     * Constructor WriteSymptomDataToFile
     *
     * @param symptoms a Map containing the symptoms with the number of occurences {anxiety=5, arrhythmias=3,...
     * @param filepath the filapath of the result.out file containing one symptom per line
     */
    public WriteSymptomDataToFile(Map<String, Integer> symptoms, String filepath) {
        this.filepath = filepath;
        this.symptoms = symptoms;
    }

    /**
     * Write in the result.out file the symptom with the number occurences , each per line
     */
    public Map<String, Integer> writeOutputFile() {
        try {
            FileWriter writer = new FileWriter(filepath);
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return symptoms;
    }
}

