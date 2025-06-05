package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for (int j = 0; j < 100; j++) {
            if (j == 50) {
                break;
            }
            System.out.println(j);
        }
    }
}
