package com.lukasz;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        String input = scanner.nextLine();
        Solution solution = new Solution(input);

        System.out.println("Score is " + solution.getScoreSum());
        System.out.println("There is " + solution.getNotCanceledGarbage() + " not cancelled garbage.");
    }
}
