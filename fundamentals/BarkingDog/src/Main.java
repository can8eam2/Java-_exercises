public class Main {
    public static void main(String[] args) {
        BarkingDog.shouldWakeUp(true, 22);
        BarkingDog.shouldWakeUp(true, 3);
        BarkingDog.shouldWakeUp(false, 3);
        BarkingDog.shouldWakeUp(false, 15);
        BarkingDog.shouldWakeUp(true, -12);
    }
}
