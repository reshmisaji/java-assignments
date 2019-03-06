package com.step.assignments;

public class ToMilesPerHour {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5D));
        printConversion(1.5D);
    }

    public static boolean isGreaterThanZero(double kilometersPerHour) {
        return kilometersPerHour < 0;
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (isGreaterThanZero(kilometersPerHour)) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (isGreaterThanZero(kilometersPerHour)) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

    }
}
