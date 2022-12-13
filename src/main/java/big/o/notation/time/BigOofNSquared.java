package big.o.notation.time;

import java.util.Arrays;
import java.util.List;

public class BigOofNSquared {
    /**
     *  O(n^2) big O of n squared
     *  quadratic time
     *  Usually happens when using nested loops
     *
     */

    //Rule 5 Remove all dominants
    /*
    common case would be nested loops. can also have multiple inputs or operations
    usually quadratic with time
    means 2 elements = 4 operations
    3 elements = 9 operations
    4 elements = 16 operations

    in nested loops
    you select first element then perform operation
    by number of total elements in input
    n * n or n^2

    removing all non-dominant means if you have O(n + n^2) need to remove n => O(n^2)

     */

    public static void main(String... args){
        List num_list = Arrays.asList(1,2,3,4,5,6,6); //O(1)
        List num_list2 = Arrays.asList(1,2,3,4,5); //O(1)
//        System.out.println(randFn2(num_list, num_list2)); //O(1)
        System.out.println(randFn3(num_list)); //O(4 + n + 2n^2)
    }

    static int randFn(List nums) {
        int total = 0; // O(1)

        for (Object num : nums) {
            for (Object num2 : nums) {
                System.out.println("First num: " +
                        num + " second num: " + num2);// O(n^2)
                total+=1; // O(n^2)
            }
        }

        return total; //O(1)
    } // calculation for this is O(1 + n^2 + n^2 + 1) => O(2 + 2n^2) => O(n^2)

    static int randFn2(List a, List b) {
        int total = 0; // O(1)

        // in this nested loop we are doing m list n number of times
        for (Object num : b) { //O(n)
            for (Object num2 : a) { //O(m)
                System.out.println("First num: " +
                        num + " second num: " + num2);// O(n^2)
                total+=1; // O(n^2)
            }
        }

        return total; //O(1)
    } //complexity is O(n * m)

    static int randFn3(List nums) {
        int total = 0; //O(1)
        boolean all_int = true; //O(1)

        for (Object num : nums) {
            System.out.println(num); //O(n)
        }

        for (Object num : nums) {
            for (Object num2 : nums) {
                System.out.println("num: " + num + " num2: " + num2); //O(n^2)
                total+=1; //O(n^2)
            }
        }
        String msg = "Rulw 5 - Remove all non-dominants"; //O(1)
        return total; //O(1)
    } //complexity: O(4 + n + 2n^2) => O(n^2)
}
