public class Application {
    public static void main (String[] args ) {
        System.out.println("Hello World");

        /**
         * Write a program to calculate the sum of n natural numbers.
         * We will take n as 100
         *
         * using for loop
         * using while loop
         */

        int number = 100;
        int total = 0;

        //Program to find sum of n natural numbers

        //Starting time
        long timeStart = System.currentTimeMillis();

        //for loop
        for (int i = 0; i < 100; i++) {
            total = total + i;
        }
        System.out.println("Total is " + total);
        //ending time
        long timeEnd = System.currentTimeMillis();

        System.out.println("Time taken is " + (timeEnd - timeStart));
    }
}
