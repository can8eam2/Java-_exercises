package com.company;
//working with int and Integer, byte,short, long
public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;
//Integer here is a wrapper class for the primitive type of int.
// Integers have the largest range of numbers and occupies 32 bits of width
// Using a wrapper like Integer here shows other ways to manipulate our int data/values
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println("Integer Maximum Value = "+myMaxIntValue);
//Example of system overflow, the computer just skips back to the maximum number
        System.out.println("Busted MAX value = "+ (myMaxIntValue+1));
//Example of system underflow, the computer just skips back to the minimum number
        System.out.println("Busted MIN value = "+ (myMinIntValue-1));
//java error caused because myMaxIntTest exceeds myMaxIntValue
       int myMaxIntTest = 2_147_483_647;
       System.out.println(myMaxIntTest);

//Bytes occupy 8 bits in width
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+myMinByteValue);
        System.out.println("Byte Max Value = "+myMaxByteValue);
        
//short can store longer range of numbers than a byte.
// shorts occupy 16 bits in width
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = "+myMinShortValue);
        System.out.println("Short Max Value = "+myMaxShortValue);
        
//long has the width of 64 bits in width, double that of int, takes int and expands from there
// You must declair your long value wiht a capital L
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = "+myMinLongValue);
        System.out.println("Long Max Value = "+myMaxLongValue);
        Long bigLongLiteralValue = 2_147_483_647L;
        System.out.println(bigLongLiteralValue);

//system is smart enough to convert back from long to short, but must not be larger than the max of short or smaller than the min of short; if you add one more up the line below will error out.
        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue/2);

//the line below would fail if left as is. myMinByteValue is treated as int in this statement as it's a system assigned as a byte. we will use casting to convert a number from one type to another
        //byte myNewByteValue = (myMinByteValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinByteValue/2);

//----------------PRACTICE---------------------

        byte thisIsMyBite = 107;
        short thisIsMyShort = 300;
        int thisIsMyInt = 214;
        long thisIsMyLong = (long) 50000L+(10L*(thisIsMyBite+thisIsMyShort+thisIsMyInt));

        System.out.println("this is my bite Value = "+thisIsMyBite);
        System.out.println("this is my short Value = "+thisIsMyShort);
        System.out.println("this is my int Value = "+thisIsMyInt);
        System.out.println("this is my long Total Value = "+thisIsMyLong);

        short myShortTotal = (short) (1000 + 10 *
                (thisIsMyBite+thisIsMyShort+thisIsMyInt));
        System.out.println("this is my short Total Value = "+myShortTotal);

    }
}
