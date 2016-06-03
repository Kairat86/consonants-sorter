package com.epam.doshekenov.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConsonantsSorter {

    ArrayList<Word> words;

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
            System.out.print(word.getValue()+",  ");
        }
        System.out.println("\n");
    }


}
