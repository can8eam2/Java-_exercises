public class Main {
    public static void main(String[] args) {
        DecimalComparator.areEqualByThreeDecimalPlaces(3.178,2.345);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.178,3.178);
        DecimalComparator.areEqualByThreeDecimalPlaces(18.008,45.775);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.178,3.178);
    }
}
