package com.step.assignments;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,3));
    }

    public static boolean hasEqualSum(int firstNumber,int secondNumber,int thirdNumber){
        return (firstNumber+secondNumber) == thirdNumber;
    }
}
