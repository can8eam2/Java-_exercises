package com.company;

public class Main {

//    public static void main(String[] args) {
//        calculateScore(true, 800, 5, 100);
//        calculateScore(true, 10000, 8, 200);
//
//    }
////    here we have created a public method that calculates the score. It has been called within our main method.
////    Notice that all we had to do was create arguments, which are variables we want to use within the method, and then define those argument's values when the method is called.
//        '
//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore +=1000;
//            System.out.println("Your final score was " +finalScore);
//        }
//    }

    //here we will show a different way to complete the challenge how to call back a variable value.
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted =5;
        int bonus = 100;
        //here we are taking the value from calculatedScore and putting it into the variable highScore
        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        //
        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

    }

//to return a data type, replace that data type where void is present        '
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=2000;
            //here we are calling back finalScore's value
            return finalScore;
            }
        //this is shorter than creating an if/else statement as we have already processed finalScore
        //returning negative 1 is Java's way of saying the value is not found
        return -1;
        }
}
