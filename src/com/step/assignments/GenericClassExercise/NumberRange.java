package com.step.assignments.GenericClassExercise;

import java.util.ArrayList;
import java.util.List;

public class NumberRange implements Range<Integer> {
    private int start;
    private int end;
    private List<Integer> numbers=new ArrayList<Integer>();

    public NumberRange(int start, int end) {
        this.start = start;
        this.end = end;
        for (int index = start; index <= end; index++) {
            this.numbers.add(index);
        }

    }

    @Override
    public List getAll() {
        return this.numbers;
    }

    @Override
    public boolean containsElement(Integer element) {
        return this.numbers.contains(element);
    }


}
