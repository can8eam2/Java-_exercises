package com.company;

public class Main {

    public static void main(String[] args) {
        /*there are 50 keywords reserve by the java program like the 8 primitive data types, 2 floating point types, boolean, char,, etc.  Keywords are data types and do not form part of the expression*/

        //a mile is equal to 1.609344 kilometres
        /*variables, values and operators make up an expression , even if it's held within parenthesis () . A statement is anything appearing before the method or classes.*/
        double kilometres = (100*1.609344);
        int highScore = 50;
        if(highScore == 50) {
            System.out.println("This is an expression");
        }

        //In the following code write down what parts of the code are the expression.

        //here score =100 is the expression
        int score = 100;

        //for the below statement, score > 99 and "You got the high score!" are both expressions
        if (score > 99) {
            System.out.println("You got the high score!");
            //score = 0 is the expression here
            score = 0;
        }
    }
}
