package com.company;

public class Main {

    public static void main(String[] args) {
	//char can only store single characters.
    //char uses 2 bytes/16 bits of memory; it also stores Unicode characters.
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

    //boolean
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
