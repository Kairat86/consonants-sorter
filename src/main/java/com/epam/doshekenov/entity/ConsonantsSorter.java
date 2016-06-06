package com.epam.doshekenov.entity;

import java.util.*;

public class ConsonantsSorter {

    List<Word> words;

    public ConsonantsSorter(String fileName) {
        words = new ArrayList<>();
        makeList(fileName);
    }

    private void makeList(String fileName) {
        Scanner sc = new Scanner(ConsonantsSorter.class.getClassLoader().getResourceAsStream(fileName));
        while (sc.hasNextLine()) {
            words.add(new Word(sc.nextLine()));
        }
    }

    public void sort() {
        Collections.sort(words);
    }

    public void print() {
        for (Word word : words) {
            System.out.print(word.getValue() + ",  ");
        }
        System.out.println("\n");
    }

    public void bubbleSort() {
        Word[] wordArray = words.toArray(new Word[words.size()]);
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = i; j < wordArray.length; j++) {
                if (wordArray[i].getConsonantsNum() > wordArray[j].getConsonantsNum()) {
                    Word temp;
                    temp = wordArray[i];
                    wordArray[i] = wordArray[j];
                    wordArray[j] = temp;
                }
            }
        }
        words.clear();
        words = Arrays.asList(wordArray);
    }

}
