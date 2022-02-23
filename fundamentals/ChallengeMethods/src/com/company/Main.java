package com.company;

public class Main {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Steve", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Phil", highScorePosition);
    }

    //a method with void is also called a procedure
    public static void displayHighScorePosition(String pName, int highScorePosition) {
        System.out.println (pName + " is now in " + highScorePosition+"  on the high score table");
    }

    public static int calculateHighScorePosition(int score) {

//        if (score >=1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//
//        return 4;
        int position = 4; //here we will begin by assuming position starts at 4
        if(score >= 1000) {
            position=1;
        }else if(score>=500){
            position=2;
        }else if (score>=100);{
            position=3;
        }
        return position;
    }

}
