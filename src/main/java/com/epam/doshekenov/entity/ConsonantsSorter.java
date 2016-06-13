package com.epam.doshekenov.entity;

import java.util.*;

public class ConsonantsSorter {

    public static List<Word> sort(List<Word> words) {
        Collections.sort(words);
        return words;
    }


    public static List<Word> bubbleSort(List<Word> words) {
        for (int i = 0; i < words.size(); i++) {
            for (int j = i; j < words.size(); j++) {
                Word firstWord = words.get(i);
                Word secondWord = words.get(j);
                if (firstWord.getConsonantsNum() > secondWord.getConsonantsNum()) {
                    words.set(i, secondWord);
                    words.set(j, firstWord);
                }
            }
        }
        return words;
    }

}
