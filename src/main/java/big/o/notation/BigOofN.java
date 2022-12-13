package big.o.notation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigOofN {

    /**
     * O(n) O of n, linear opertions used during loops i.e for, while
     * O(1) constant, each of these values have some weightage
     *
     * Program calculates O(n) using inputs and operations
     * O(n) searches every element even if element is found
     *
     * number of operations = number of input pattern is big o of n, linear path
     * Luffy, Zoro, Nami, Usopp, Sanji, Chopper, Robin, Brook, Franky, Jimbei
     */

    public static void main(String... args) {
        //4 inputs 4 operations
        //linear path
        //pattern O(n) complexity big o of n
        List<String> firstStrawHats = Arrays.asList(new String[]{"Luffy", "Zoro", "Nami", "Sanji"});

        //5 items 5 operations
        //linear path
        //pattern O(n) complexity big o of n
        List<String> extendedStrawHats = Arrays.asList(new String[]{"Sanji", "Usopp", "Chopper", "Robin", "Brook"});

        pirateCrew(firstStrawHats);

    }

     static void pirateCrew (List crew) {
        for (Object member : crew) {
            if ("Sanji".equalsIgnoreCase(member.toString()))
                System.out.println("Straw Hat Pirate");
        }
    }
}
