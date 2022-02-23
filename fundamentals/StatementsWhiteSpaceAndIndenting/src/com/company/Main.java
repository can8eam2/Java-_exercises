package com.company;

public class Main {

    public static void main(String[] args) {
        //from the data type to the semi-colon, this is a java statement (though not all java statements end with a semi-colon)
	int myVariable = 50;
    if (myVariable==50) {
        System.out.println("Printed");
    }

    myVariable++;
    myVariable--;
    System.out.println("This is a test");
//Even if broken down in seperate lines, java will still read and output this together.
    System.out.println("This is "
            +"another"
            +" still more.");
    //you can have multiple statements in one line
        int anotherVariable = 50;myVariable--;System.out.println("This is another one");

    }
}
