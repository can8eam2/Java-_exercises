package com.company;

public class Main {

    public static void main(String[] args) {
	//byte~
    //short~
    //int*
    //long+
    //float~
    //double*
    //char+
    //boolean*
    //*most commonly used, +used every now and then, ~rarely used

 /*Strings are actually a Class in Java; this was done for the ease of use and Flexibility. Strings can contain any sequence of characters; limited by available memory*/

        String myString = "This is a string";
        System.out.println("myString is equal to "+myString);

        //changing the string to include more information
        myString = myString+" , and this is more.";
        System.out.println("myString is equal to "+myString);

        //adding still more informaiton to myString
        myString = myString+" \u00A9 2019";
        System.out.println("myString is equal to "+myString);

        /* numbers will be treated as string, you must convert to a primitive type that we are able calculate numerically. */
        String numberString ="250.55";
        numberString = numberString+"49.95";
        System.out.println(numberString);

        /*Java will convert the integer to a String and appends it to the original value of lastString. Strings in java are immutable, meaning they are not deleted or changed once created, but a new string is created to contain the new values assigned to the string, Hence new values being appended. */
        String lastString = "10";
        int myInt = 50;
        lastString = lastString+myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
