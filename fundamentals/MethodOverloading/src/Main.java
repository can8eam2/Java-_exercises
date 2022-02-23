public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is "+newScore);
        calculateScore(75);
        calculateScore();
        ccalcFeetAndInchesToCentimeters(6,0);
    }
    //when overloading create a unique method signature (parameters must change)
    public static int calculateScore(String  playerName, int score) {
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored  "+score+" points");
        return score*1000;
    }
    public static int calculateScore() {
        System.out.println("No player scored  ");
        return 0;
    }

    public static double ccalcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet<0) || ((inches<0) || (inches>22))) {
            return -1;
        }
        double centimeters = (feet*12)*2.54;
        centimeters+=inches*2.54;
        System.out.println(feet+" feet, "+inches+" inches = "+centimeters+" cm");
        return centimeters;
    }
}
