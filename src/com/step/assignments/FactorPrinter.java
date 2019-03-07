package com.step.assignments;

public class FactorPrinter {
    public static void printFactors(int number){
        if(number>=1){
            for(int index=1;index<=number;index++){
                if(number%index==0){
                    System.out.println(index);
                }
            }
            return;
        }
        System.out.println("Invalid Value");
    }
}
