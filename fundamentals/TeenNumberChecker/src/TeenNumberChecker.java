public class TeenNumberChecker {
    public static boolean hasTeen (int x, int y, int z) {
        if (isTeen(x) || isTeen(y) || isTeen(z)) {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int teen) {
        if (teen >= 13 && teen<=19) {
            System.out.println(teen+" is a teen");
            return true;
        }
        return false;
    }
}
