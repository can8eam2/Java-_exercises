package com.company;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

//    if (score < 5000 && score > 1000) {
//        System.out.println("Your score was less than 5000 but greater than 1000!");
//    } else if(score<1000) {
//            System.out.println("Your score was less than 1000");
//    } else {
//        System.out.println("Got here");
//    }
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//once a code block completes processing, the system automatically   deletes any variables created inthe code block. You will not be able to acess variables created inside the code block outside of that code block that is why the below errors out when attemting to call back finalScore. You can keep accessing variables created outside of the code block.
        int savedFinalScore = finalScore;
    }
}
