package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; //1+2=3
        System.out.println("1+2= "+ result);

        int previousResult = result;
        System.out.println("previousResult = " +previousResult);
        result = result-1; //3-1=2
        System.out.println("3-1= "+result);
        System.out.println("previousResult = " +previousResult);

        result = result * 10; //2*10 = 20
        System.out.println("2 * 10 = "+result);

        result = result/5; //20/5 = 4
        System.out.println("20 / 5 =  "+result);

        result = result % 3; //give remainder of 4 % 3 - 1
        System.out.println("4 % 3 = "+result);

        // -------------------ABREVIATING CALCULATIONS-------------------

        //result = result + 1;
        result++; //1 + 1 = 2
        System.out.println("1 + 1 = "+result);

        //result = result - 1
        result--; //2 - 1 = 0
        System.out.println("2 - 1 = "+result);

        //result = result+2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 =  " +result);

        //result = result * 10
        result *= 10; //3*10= 30
        System.out.println("3 * 10 = "+result);

        //result = result / 3
        result /= 3; //30 / 3 = 10
        System.out.println("30 / 3 = "+result);

        //result = result - 2
        result -= 2; // 10-2 = 8
        System.out.println("10 - 2 = "+result);

        /*
       --------------------------BOOLEAN----------------------------------
        boolean isAlien = false;
       if (isAlien == true)
       System.out.println("It is not an alien!");
       ****if statement without code block ( {} ) it doesn't follow  boolean statement
       System.out.println("And I am scared of aliens!");
       */

        boolean isAlien = false;
        if (isAlien == false) {
            //when we block the code using {} the boolean is
            //applied to both lines below.
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }
        // ----------------------LOGICAL AND OPERATOR--------------------------------
        int topScore =80;
        if (topScore <= 100) { /*you can substitute the operators for == equals, != not eual to, < less than, > greater than, <= less than or equal to, >= greater than or equal to */
            System.out.println("You've got the high score!");
        }
        int secondTopScore = 60;
        //&& adds more conditions to be met for code to be executed.
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
