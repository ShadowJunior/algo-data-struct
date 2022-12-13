package big.o.notation;

import java.util.Arrays;
import java.util.List;

public class BigOof1 {
    /**
     * O(1) constant, each of these values have some weightage
     *
     * Program calculates O(1) printing value of input
     * O(1) runs on constant time
     *
     * number of operations performed and  number of input  is 1 pattern is big o of 1, constant path
     * number of items does not determine number of operations
     * (O)peration does not depend on input
     * no matter how large the input the operation is 1 to 1
     * Scalability: no matter how big the input list is task is performed a constant amount of time in function
     *
     * based on the program, no matter how many elements in the list O(1) always returns 1 element
     * Luffy, Zoro, Nami, Usopp, Sanji, Chopper, Robin, Brook, Franky, Jimbei
     *
     * Complexity of constant O(1)
     */

    public static void main(String[] args) {
        List<String> strawHats = Arrays.asList("Luffy", "Zoro", "Nami", "Usopp", "Sanji", "Chopper", "Robin");
        String[] strawHats2 = {"Luffy", "Zoro", "Nami", "Usopp", "Sanji", "Chopper", "Robin"};

        displayCrewMember(strawHats);
        printCrewMember(strawHats2);
    }

    static void displayCrewMember(List<String> members) {
        System.out.println(members.get(0));
    }

    static void printCrewMember(String[] members) {
        //complexity big o of 2, each operation has one input regardless the size of the input
        System.out.println(members[1]); //O(1)
        System.out.println(members[2]); //O(1)
    }
}
