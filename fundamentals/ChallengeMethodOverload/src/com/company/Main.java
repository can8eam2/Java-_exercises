package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(176);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches >= 0) || (inches <= 12)) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches  is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

/*
method overloading is a feature that allows us to have more than one method with the same name, as long as we use different parameters
it's the ability to create multiple methods with the same name with different functions
Calls to an overloaded method will run specific implementations of that method
*/
