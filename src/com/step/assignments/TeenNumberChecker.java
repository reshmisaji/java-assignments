package com.step.assignments;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,1,11));
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if (isTeen(firstNumber) || isTeen(secondNumber)||isTeen(thirdNumber)) {
            return true;
        }

        return false;
    }
    public static boolean isTeen(int number){
        return number>=13 && number <=19;
    }
}
