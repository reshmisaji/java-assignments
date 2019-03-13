package com.step.assignments.Exercise;

public class IdentityCard implements Duplicable<DuplicateIdentityCard> {

    @Override
    public DuplicateIdentityCard duplicate() {
        return new DuplicateIdentityCard();
    }
}
