package big.o.notation.space;

import java.util.List;

public class Memory {

    public static void main(String... args) {
        double[] items = {3,4,5,6}; //O(1)
//        System.out.println(displayCube(items)); //O(1)
        System.out.println(displayAllCubes(items));

    }

    static double displayCube(double[] items) {
        double result = Math.pow(items[0],3); //O(1) constant space
        System.out.println(result); //O(1)

        return result; //O(1)
    } // complexity O(3) => O(1)

    static double displayAllCubes(double[] items) {
        double result = 0.0;

        for (double num : items) {
            System.out.println(Math.pow(num,3)); //O(n)
            result += Math.pow(num,3);
        }
        return result;
    }
}
