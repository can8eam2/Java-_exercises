package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted =5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " +finalScore);
        }
//        boolean secondgameOver = true;
//        int secondScore = 10000;
//        int secondLevelCompleted = 8;
//        int secondBonus = 200;
//
//        if (secondgameOver) {
//            int finalScore = secondScore+(secondLevelCompleted*secondBonus);
//            System.out.println("Your final score was " +finalScore);
//        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your new final score is " +finalScore);
            //instead of wasting space and redefining old code like above, we can just redefine existing variables since they sit outside of the code block. The advantage of this is that it runs quicker, however we do not have a perminant records of the first set of variables' definition.
        }
    }
}
