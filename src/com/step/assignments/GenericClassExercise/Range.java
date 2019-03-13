package com.step.assignments.GenericClassExercise;

import java.util.List;

public interface Range<T> {


    public List<T> getAll() ;


    public boolean containsElement(T element);
}
