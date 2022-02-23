package com.company;

public class Main {

    public static void main(String[] args) {
        /* Floating Point Numbers are not whole, but fractions of a whole numbers that are expressed through decimal points. Two primitive types are used to express this, Float Precision (32 bits wide) and Double Precision (64 bits wide). Precision refers to the number of places after the decimal point. */

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+myMinFloatValue);
        System.out.println("Float maximum value = "+myMaxFloatValue);

//uses twice the amount of memory as float, but more precise
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = "+myMinDoubleValue);
        System.out.println("Double maximum value = "+myMaxDoubleValue);
        /* you can use lowercase f and d to remind the system that you are looking for (f)loat or (d)ouble float values. If number for float is a double-digit without the f, the system will error out believing it's supposed to be a double float. */
        int myIntValue = 5 / 3;
        //float myFloatValue = (float) (5.25);
        float myFloatValue = 5f / 3f;
        double myDoubleValue =5d / 3d;
        System.out.println("My Integer Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Doouble Value = " + myDoubleValue);

    }
}
