package big.o.notation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingOperations {

    /**
     * count operations step by step, line by line
     * analyze program complexity
     * @param args
     */

    public static void main(String... args) {
        List<String> strawHats = Arrays.asList("Luffy", "Zoro", "Nami", "Usopp",
                "Sanji", "Chopper", "Robin"); //assigning O(1)


        //calculation of operations
        //simplification O(6 +2n) => O(n) need to understand this part, simplification
        System.out.println("List in mainFn: " +
                randomFn(strawHats)); //O(6 + 2n) complexity of program

    }

    static int randomFn(List<String> members) {
        String member = members.get(0); //O(1) constant complexity
        int total = 0; //assigning O(1)
        List<String> members2 = new ArrayList<String>(); //assigning O(1)

        for (String mate : members) { //operations in loop depend on number of inputs
            total+=1; //O(n) linear complexity
            members2.add(mate); //O(n) linear complexity
        }
        System.out.println("List in randomFn: " + members2); //O(1)
        return total; //O(1) constant complexity
    }
}
