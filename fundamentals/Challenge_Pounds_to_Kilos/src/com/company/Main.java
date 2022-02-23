package com.company;

public class Main {

    public static void main(String[] args) {
	// CONVERT THE NUMBER OF POUNDS TO KILOGRAMS
            int numPounds = 75;
            //can also be typed as
            //double numPounds = 75d;
            double numKilos = 0.45359237d;
            double convertNum = numPounds*numKilos;

            System.out.println(numPounds+" Pounds = "+convertNum+" Kilograms");
    }
}
/* float and double are great for general use. For precise calculations there is too much of a limitation. Using BigDecimal class would work best *? */