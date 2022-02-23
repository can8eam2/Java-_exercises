package com.company;

public class Main {

    public static void main(String[] args) {
        getDurationString(61, 50);
        getDurationString(35000);
    }

    private static int getDurationString(int min, int sec) {
        if ((min >= 0) && ((sec >= 0) && (sec <= 59))) {
            int hours = min / 60;
            int remMin = min%60;
//---------------------------------------creating leading 0
            String hoursString = hours + "h";
            if(hours<10) {
                hoursString = "0"+hoursString;
            }
            String minutesString = min + "h";
            if(min<10) {
                minutesString = "0"+minutesString;
            }
            String secondsString = sec + "s";
            if(hours<10) {
                secondsString = "0"+secondsString;
            }

        }
        System.out.println("Invalid value");
        return -1;
    }
//--------------------------------------------Second method, method overloading
    private static int getDurationString(int sec) {
        if (sec < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        int min = sec / 60;
        int remSec = sec % 60;
        return getDurationString(min, remSec);
    }
}