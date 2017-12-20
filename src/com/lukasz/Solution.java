package com.lukasz;

public class Solution {
    private String input;
    private int scoreSum;
    private int notCanceledGarbage;

    public int getScoreSum() {
        return scoreSum;
    }

    public int getNotCanceledGarbage() {
        return notCanceledGarbage;
    }

    public Solution(String input) {
        this.input = input;

        boolean garbage = false;
        boolean canceled = false;
        int openingBracketsCounter = 1;
        scoreSum = 1;
        notCanceledGarbage = 0;

        for(int i = 1; i < input.length() - 1 && openingBracketsCounter > 0; i++) {

            char currentChar = input.charAt(i);

            if (canceled) {
                canceled = false;

            } else if (currentChar == '{' && !garbage) {
                openingBracketsCounter++;
                scoreSum += openingBracketsCounter;

            } else if (input.charAt(i) == '}' && !garbage) {
                openingBracketsCounter--;

            } else if (input.charAt(i) == '<' && !garbage) {
                garbage = true;

            } else if (input.charAt(i) == '>' && garbage) {
                garbage = false;

            } else if (input.charAt(i) == '!') {
                canceled = true;
            } else if (garbage) {
                notCanceledGarbage++;
            }
        }
    }


}
