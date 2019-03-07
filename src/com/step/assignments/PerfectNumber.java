package com.step.assignments;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number>=1){
            int sumOfDivisors = 0;
            for (int index=1;index <=number/2;index++){
                if(number%index==0){
                    sumOfDivisors+=index;
                }
            }
            return number==sumOfDivisors;
        }
        return false;
    }

}
