package com.step.assignments;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        double counter = 0d;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            counter++;
            sum += num;

        }
        long average = (long) (Math.round(sum/counter));
        System.out.println("SUM = "+sum+" AVG = "+average);
    }
}
