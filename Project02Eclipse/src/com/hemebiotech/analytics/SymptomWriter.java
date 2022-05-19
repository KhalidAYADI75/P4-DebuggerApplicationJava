package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Write in the result.out file the symtpoms with their number of occurences found in the symptoms.txt file
 */
public interface SymptomWriter {
    Map<String, Integer> writeOutputFile();
}
