public class BarkingDog {
        public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
            //
            if(barking && (hourOfDay <= -1 || hourOfDay >= 24)) {
                System.out.println("Invalid Entry");
                return false;
            } else if (barking && (hourOfDay<=7||hourOfDay>=23)) {
                System.out.println("Wake up the dog is barking");
                return barking;
            }else
                System.out.println("Everything is peachy!");
                return false;
        }
    }
