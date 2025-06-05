package labs_examples.datatypes_operators.examples;

// A promotion surprise!
class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, no cast needed

        b = 10;
        // Cast needed because when we're engage in arithmetic expressions, Java treats the values as type int. Hence, we need to do explicit type conversion from int to byte (narrowing type conversion).
        b = (byte) (b * b); // cast needed!!

        System.out.println("i and b: " + i + " " + b);
    }
}