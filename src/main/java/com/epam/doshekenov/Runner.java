package com.epam.doshekenov;

import com.epam.doshekenov.entity.ConsonantsSorter;
import com.epam.doshekenov.entity.Word;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static final String STRINGS_TXT = "strings.txt";

    public static void main(String[] args) {

        List<Word> words = makeList(STRINGS_TXT);

        ConsonantsSorter.print(words);
        ConsonantsSorter.bubbleSort(words);
        ConsonantsSorter.print(words);
    }

    private static List<Word> makeList(String fileName) {
        Scanner sc = new Scanner(ConsonantsSorter.class.getClassLoader().getResourceAsStream(fileName));
        List<Word> words = new ArrayList<>();
        while (sc.hasNextLine()) {
            words.add(new Word(sc.nextLine()));
        }
        return words;
    }
}

