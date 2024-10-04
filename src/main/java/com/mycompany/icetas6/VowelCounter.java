/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetas6;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
/**
 * This program counts the number of vowels in a user-input string.
 */
public class VowelCounter {

    /**
     * Counts the number of vowels in the given sentence.
     * 
     * @param sentence The input string to count vowels in.
     * @return The number of vowels in the sentence.
     */
    public static int countVowels(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        // Convert the sentence to lowercase for case-insensitive counting
        sentence = sentence.toLowerCase();
        
        int count = 0;
        String vowels = "aeiou";
        
        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            // Check if the character is a vowel using indexOf
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        
        return count;
    }
}

