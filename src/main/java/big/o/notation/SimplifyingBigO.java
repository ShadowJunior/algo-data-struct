package big.o.notation;

import java.util.Arrays;
import java.util.List;

public class SimplifyingBigO {
    /**
     * Simplifying Big O
     *
     * rules
     *
     * 1. Focus on scalability
     * 2. Consider worst case scenario
     * 3. Remove all possible constants
     * 4. Consider different variable for different inputs
     * 5. Remove all dominants
     */


    //Rule 1 Focus on scalability
    /*
    Focus on scalability means the input, or "n" is tending towards 1 million or infinity
    We cannot predict the volume of input, could upwards of 1MM
    Take "n" as a large number to check scalability
     */

    //Rule 2 Considering the worst case scenario
    /*
    Worst case scenario means what would happen if input is at the last position or nearing infinity
    in loop we may not know when the condition will be met so safest
    to assume worst case is that the program needs to traverse the entire data set to find a match
    making it reasonable for (O)perations to run  an "n" amount of times in the program
     */

    //Rule 3 Remove all possible constants
    /*
    Constants are operations that occur 1 to 1. We need to remove when comparing to "n"
    Also remove constants attached to "n"
    O(6 + 2n) means 6 constant operations (1:1) and 2 separate operations occurring in a loop
    making their execution dependent on the number of inputs hence 2n or 6n
     */

    //Rule 4 Consider different variable for different inputs
    /*
    complexity is increased when operation has multiple variables and inputs

     */

    //example
    public static void main(String... args) {
        List num_list = Arrays.asList(1,2,3,4,5,6); //O(1)
        List char_list = Arrays.asList('a','b','c','d'); //O(1)

        randomFn(num_list, char_list);
    }
    static void randomFn(List a, List b) {
        System.out.println("items in a: ");
        for (Object item : a) {
            System.out.print( item + " ");//O(n)
        }
        System.out.println();
        System.out.println("items in b: ");
        for (Object item : b) {
            System.out.print( item + " "); //O(m)
        }
    } //complexity is O(m + n)

    //Rule 5 Remove all dominants
    /*

     */
}
