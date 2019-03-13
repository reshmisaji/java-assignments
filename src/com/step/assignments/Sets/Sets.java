package com.step.assignments.Sets;

import java.util.Set;

public class Sets<T> {
    private Set<T> firstSet;
    private Set<T> secondSet;

    public Sets(Set<T> firstSet, Set<T> secondSet) {
        this.firstSet = firstSet;
        this.secondSet = secondSet;
    }

    public Set<T> union(){
        Set<T> unionSet = Set.copyOf(this.firstSet);
         unionSet.addAll(this.secondSet);
         return unionSet;
    }

    public Set<T> intersection(){
        Set<T> intersectionSet = Set.copyOf(this.firstSet);
        intersectionSet.retainAll(this.secondSet);
        return intersectionSet;
    }

    public Set<T> difference(){
        Set<T> differenceSet = Set.copyOf(this.firstSet);
        differenceSet.removeAll(this.secondSet);
        return differenceSet;
    }

}
