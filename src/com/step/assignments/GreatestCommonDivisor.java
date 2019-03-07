package com.step.assignments;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second){
        if(first>=10&&second>=10){
            int hcf=1;
            for(int index=2;index <=first/2;index++){
                if(first%index==0&&second%index==0){
                    hcf=index;
                }
            }
            return hcf;
        }
        return -1;
    }
}
