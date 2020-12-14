package com.hemebiotech.analytics;

/**
 * anything that will write a list of symtoms and their values
 */

public interface ISymptomsWriter {
    /**
     * write in a file a listing of symptoms and their occurencies sorted by alphabetical order
     */
    void writeSymptoms();
}