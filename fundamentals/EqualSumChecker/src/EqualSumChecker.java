public class EqualSumChecker {
    public static boolean hasEqualSum (int x, int y, int z) {
        if (x+y==z) {
            System.out.println(x+" + "+y+" = "+z);
            return true;
        }
        System.out.println(x+" + "+y+" does not equal "+z);
        return false;
    }
}
