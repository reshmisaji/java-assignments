package com.step.assignments;

public class MinutesAndSeconds {
    public static void main(String[] args) {
        System.out.println(getDurationString(-5, 6));
        System.out.println(getDurationString(9, -3));
        System.out.println(getDurationString(9, 64));
        System.out.println(getDurationString(9, 9));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(48645900));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int totalSeconds = (minutes * 60) + seconds;
            int hours = totalSeconds / 3600;
            int totalMinutes = (totalSeconds % 3600);
            minutes = totalMinutes / 60;
            seconds = totalSeconds % 60;
            return  hours + "h " + minutes + "m " + seconds +"s" ;
        }
        return "Invalid value";

    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0 ) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
        return "Invalid value";

    }
}
