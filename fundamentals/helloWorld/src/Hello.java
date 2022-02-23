public class Hello {
// first main method
    public static void main(String[]args) {
        //variables - string, integers, etc.
        // 8 primitive data types are as follows boolean, byte, char, short, int, long, float, double. These are the building blocks to manipulate our data.
        System.out.println("Hello Liliana, let's give an ode to the world!!!");

        int myFirstNumber = (10+5) + (2*10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber*2;
        int myTotal = myFirstNumber+mySecondNumber+myThirdNumber;
        int myLastOne = 1000-myTotal;

        System.out.println("(10+5) + (2*10) = ");
        System.out.println(myFirstNumber);
        System.out.println("+");
        System.out.println(mySecondNumber);
        System.out.println("+ (");
        System.out.println(myFirstNumber);
        System.out.println("*2) = ");
        System.out.println(myThirdNumber);
        System.out.println("Total = ");
        System.out.println(myTotal);
        System.out.println("Last One = ");
        System.out.println(myLastOne);

    }
}

