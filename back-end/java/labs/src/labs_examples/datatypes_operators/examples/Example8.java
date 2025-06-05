package labs_examples.datatypes_operators.examples;

// Demonstrate block scope.
class ScopeDemo {
    public static void main(String[] args) {
        // Inner scope can read out, but outer scope cannot read in. Variable is scoped is depended on where it was defined.

        int x; // known to all code within main

        x = 10;
        if(x == 10) { // start new scope
            int y = 20; // known only to this block

            // x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y not known here

        // x is still known here.
        System.out.println("x is " + x);
    }
}