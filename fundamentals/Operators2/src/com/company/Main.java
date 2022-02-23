package com.company;

public class Main {

    public static void main(String[] args) {
        int topScore = 80;
        if (topScore > 100){
            System.out.println("You got the high score!");
        }
        //&&  is the AND boolean operator
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100!");
        }
        // || is the OR boolean operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        /* note that using one = will "redefine" a boolean variable but not an int */
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not a car");
        }
        /*Ternary Operator  is an operator with three operands
        * 1st operand is the condition you are testing  (isCar)
        * 2nd operand is the value assigned to isCar if the condition is met
        * 3rd operand assigns the value of isCar
        * If isCar is true, it meets the condition : isCar equals false
        * Ternary Operators are good shortcuts to if-then-else statements*/

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true but isCar is false");
        }
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true:false; {
            System.out.println("Client is over eighteen");
        }
    }
}
