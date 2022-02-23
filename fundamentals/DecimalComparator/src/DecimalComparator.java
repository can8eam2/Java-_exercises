public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double x, double y){
        //converting to int, moving decimal up 3 places
        System.out.println(x = (int)(x*1000));
        System.out.println(y = (int)(y*1000));
        if (x==y) {
            System.out.println("Numbers are equal");
            return true;
        }
        System.out.println("Numbers are NOT equal");
        return false;
    }
}
