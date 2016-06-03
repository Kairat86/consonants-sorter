package com.epam.doshekenov;

import com.epam.doshekenov.entity.ConsonantsSorter;

public class Runner {

    public static void main(String[] args) {

        ConsonantsSorter vowelsSorter=new ConsonantsSorter("strings.txt");
        vowelsSorter.print();
        vowelsSorter.sort();
        vowelsSorter.print();
    }
}
