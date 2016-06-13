package com.epam.doshekenov.entity;


public class Word implements Comparable<Word> {

    private String value;

    public Word(String value) {
        this.value = value;
    }

    public int compareTo(Word o) {
        return this.getConsonantsNum() - o.getConsonantsNum();
    }

    public int getConsonantsNum() {
        int count = 0;
        for (char ch : value.toCharArray()) {
            if (check(ch)) {
                count++;
            }
        }
        return count;
    }

    private boolean check(char ch) {
        switch (Character.toUpperCase(ch)) {
            case 'A':
                return false;
            case 'E':
                return false;
            case 'I':
                return false;
            case 'O':
                return false;
            case 'U':
                return false;
            case 'Y':
                if (value.charAt(0) == 'Y') {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public String getValue() {
        return value;
    }
}
