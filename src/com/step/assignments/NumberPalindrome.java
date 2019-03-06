package com.step.assignments;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));

    }

    public static boolean isPalindrome(int number) {
        Integer numberToCheck = Math.abs(number);
        String numberInString = numberToCheck.toString();
        String reverseString = "";
        while (numberToCheck != 0) {
            reverseString += numberToCheck % 10;
            numberToCheck = numberToCheck / 10;
        }
        return numberInString.equals(reverseString);
    }
}
