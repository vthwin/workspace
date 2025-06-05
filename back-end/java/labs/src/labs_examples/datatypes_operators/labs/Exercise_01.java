package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 1: Variable declaration and Initialization
 *
 *      Write the necessary code to complete the following:
 *
 *      1. Declare an int, a double, a float and a char
 *      2. Assign appropriate values to each
 *      3. Print out each variable to the console
 *
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // write code here
        int x;
        double b;
        float c;
        char d;

        x = 5;
        b = 2.23;
        c = 3.54324f; // must append an f to values before assigning to float because by default, floating point values are treated as a double data type.
        d = 'D';

        System.out.println("Int: " + x);
        System.out.println("Double: " + b);
        System.out.println("Float: " + c);
        System.out.println("Char: " + d);


    }
}



