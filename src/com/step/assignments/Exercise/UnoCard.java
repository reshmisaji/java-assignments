package com.step.assignments.Exercise;

public class UnoCard implements Duplicable<DuplicateUnoCard> {

    @Override
    public DuplicateUnoCard duplicate() {
        return new DuplicateUnoCard();
    }
}
