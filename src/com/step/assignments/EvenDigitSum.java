package com.step.assignments;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(52));
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        while(number!=0){
            int digit = number%10;
            number = number/10;
            if(digit%2==0) {
                sum += digit;
            }
        }
        return sum;
    }
}
