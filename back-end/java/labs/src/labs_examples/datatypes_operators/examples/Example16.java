package labs_examples.datatypes_operators.examples;

// *** This program will not compile. ***
class LtoD_2 {
    public static void main(String args[]) {
        long L;
        double D;

        D = 100123285.0;
        // It is only illegal to set L = D if we don't explicitly convert a value from a double var to a long. Due to narrowing conversion, which require explicitly type conversion.
        L = (long) D; // Illegal!!!

        //System.out.println("L and D: " + L + " " + D);

    }
}