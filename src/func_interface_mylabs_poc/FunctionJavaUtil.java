package func_interface_mylabs_poc;
// Importing interface
import java.util.function.Function;

public class FunctionJavaUtil {
    // Java Program to Illustrate Functional Interface
    // Via apply() method
    // Main driver method
    public static void main(String args[])
    {
        // Function which takes in a number
        // and returns half of it
        //Function<Integer, Double> half = a -> a / 2.0;
        Function<Double, Double> half = a -> a / 2.0;
        Double dblInput= 58.5;

        // Applying the function to get the result
        Double dd = YOUR_CODE_HERE;
        System.out.println(dd);
    }
}




