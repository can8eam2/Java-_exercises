public class LeapYearCalculator {
    public static boolean isLeapYear (int year) {

        if ((year<=0) && (year>=1000)) {
            System.out.println(year+" is NOT a Leap Year");
        }
        if (year % 4 == 0) {
            if (year % 100== 0) {
                return (year % 400 == 0);
            }
            System.out.println(year+" is  a Leap Year");
            return true;
        }
        System.out.println(year+" is NOT a Leap Year");
        return false;
    }
    }

