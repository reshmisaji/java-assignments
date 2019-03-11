package com.step.assignments;

public class FlourPacker {

    public static boolean canPack(int bigCount,int smallCount,int goal){
        return 5*bigCount + 1* smallCount == goal;
    }
}
