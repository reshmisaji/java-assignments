package com.step.assignments;

public class SharedDigit {
    public static void main(String[] args) {
    }

    public static boolean hasSharedDigit(int num1,int num2){
        if(num1>=10 && num1 <=99 && num2>=10 &&num2 <=99){
            while(num1!=0){
                int rem = num1%10;
                int secondNum = num2;
                num1=num1/10;
                while(secondNum!=0){
                    int digit = secondNum%10;
                    secondNum = secondNum/10;
                    if(rem == digit){
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
