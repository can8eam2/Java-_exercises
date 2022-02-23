package com.company;

public class Main {

    public static void main(String[] args) {
	/*Operator Challenge CHPT 3
	* 1. Create a double variable with a value of 20
	* 2. Create a second variable of type double with the value 80.00
	* 3.Add both numbers together and multiply by 100.00
	* 4. Use the remainder operator to figure out what the remainder from the result in step 3 and 40.oo
	* 5.Create a boolean variable that assigns the value true if the remainder in #4 is 0 or false if it is not zero
	* 6.Output the boolean variable
	* 7. Write n if-then statement that displays a message "got some remainder" if the boolean in step 5 is not true*/

        double x = 20d;
        double y = 80d;
        double total = ((y+x)*100.00d);
        double rmain= (total%40.00d);
        System.out.println("The total = " + total);
        System.out.println("The remainder = " + rmain);
        boolean noRmain = (rmain == 0)?true:false;
        if(!noRmain) {
            System.out.println("Got some remainder = " + rmain);
        } else {
            System.out.println("There is no remainder = " + noRmain);
        }
    }
}
