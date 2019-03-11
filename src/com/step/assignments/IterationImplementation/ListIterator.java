package com.step.assignments.IterationImplementation;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private List list;
    private int currentIndex;

    public ListIterator(List list) {
        this.list = list;
        this.currentIndex = -1;
    }

    public boolean hasNext() {
        return this.currentIndex+1 < list.size();
    }

    public int next() {
        if (hasNext()) {
            this.currentIndex++;
            int value = (int) this.list.get(this.currentIndex);
            return value;
        }
        throw new NoSuchElementException("No such element exist");

    }
}
