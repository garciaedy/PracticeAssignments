package func_interface_mylabs_poc;

// Java Program to illustrate compose() method
//Importing Function interface

import java.util.function.Function;

//Main class

public class FunctionJavaUtil3 {
    // Main driver method
    public static void main(String args[])
    {
        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // INSERT CODE TO TRIPLE THE VALUE OF THE HALF FUNCTION
        // Function to triple the value
        Function<Double, Double> triple = a -> a*3;

        // Composing the functions to first half and then triple the result
        Function<Integer, Double> halfThenTriple = half.andThen(triple);

        // Applying the function to get the result
        System.out.println(half.apply(5));
    }
}