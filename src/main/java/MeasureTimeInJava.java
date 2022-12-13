public class MeasureTimeInJava {

    public static void main (String[] args) {
/**
 * Not the best solution
 */
        //execution for loop
        long forStartTime = System.nanoTime(); // time program starts
        for (int i = 0; i < 1000000; i++) {
            Object obj = new Object();
        }
        long forElapsedTime = System.nanoTime() - forStartTime; //calculation from start til now (end)

        System.out.println("Elapsed time to run for loop in millis: " +
                forElapsedTime/1000000 + " ms"); // 1MM because it's nano, more accurate

        //execution while loop
        long whileStartTime = System.nanoTime();
        int numOfObj = 1000000;
        while(numOfObj > 0) {
            Object obj1 = new Object();
            numOfObj--;
        }
        long whileElapsedTime = System.nanoTime() - whileStartTime;

        System.out.println("Elapsed time to run while loop in millis: " +
                whileElapsedTime/1000000 + " ms"); // 1MM because it's nano, more accurate
    }
}
