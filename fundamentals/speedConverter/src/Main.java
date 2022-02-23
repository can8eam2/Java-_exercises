public class Main {
    public static void main(String[] args) {
        //we're going to save the variable in miles and print it below
        //calling speedconverter class along with tomilesperhour
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = "+miles);

        SpeedConverter.printConversion(10.5);
    }
}
