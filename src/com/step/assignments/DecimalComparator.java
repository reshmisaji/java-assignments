package com.step.assignments;

import java.util.*;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1D, 2D));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstDecimal, double secondDecimal) {
        int firstNumber = (int) (firstDecimal*1000) ;
        int secondNumber = (int) (secondDecimal*1000D);

        return firstNumber == secondNumber;
    }
}
