package com.step.assignments.GenericClassExercise;

import java.util.ArrayList;
import java.util.List;

public class AlphabetRange implements Range<Character> {
    private char start;
    private char end;
    private List<Character> alphabets = new ArrayList<Character>();

    public AlphabetRange(char start, char end) {
        this.start = start;
        this.end = end;

        for(char index=start;index<=end;index++){
            this.alphabets.add(index);
        }
    }

    @Override
    public List getAll() {
        return this.alphabets;
    }

    @Override
    public boolean containsElement(Character element) {
        return this.alphabets.contains(element);
    }


}
