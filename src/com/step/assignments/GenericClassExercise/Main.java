package com.step.assignments.GenericClassExercise;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NumberRange numberRange = new NumberRange(1, 10);
        System.out.println(numberRange.getAll());
        System.out.println(numberRange.containsElement(11));
        System.out.println(numberRange.containsElement(10));

        AlphabetRange alphabetRange = new AlphabetRange('g', 'z');
        System.out.println(alphabetRange.getAll());
        System.out.println(alphabetRange.containsElement('d'));
        System.out.println(alphabetRange.containsElement('v'));


    }
}
