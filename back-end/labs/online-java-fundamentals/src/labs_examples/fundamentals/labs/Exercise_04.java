package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below

        // Numeric Types
        // 8-Bit Numeric Data Type
        byte byteNum = 127;
        System.out.println("byteNum is: " + byteNum);
        // 16-Bit Numeric Data Type
        short shortNum = 32767;
        System.out.println("shortNum is: " + shortNum);
        // 32-Bit Numeric Data Type
        int intNum = 34252;
        System.out.println("intNum is: " + intNum);
        // 64-Bit Numeric Data Type
        long longNum = 123456789123456789L;
        System.out.println("longNum is: " + longNum);

        // Character
        // Single 16-Bit Character, must be wrapped in single quotes.
        char charLetter = 'A';
        System.out.println("charLetter is: " + charLetter);

        // Decimal or Fractional Data Types
        // 32-Bit Decimal/Floating Point Data Type
        float floatNum = 3.14f;
        System.out.println("floatNum is: " + floatNum);
        // 64-Bit Decimal/Floating Point Data Type
        double doubleNum = 3.14323232;
        System.out.println("doubleNum is: " + doubleNum);

        // Logical True or False Data Type
        // 1 Bit (0 = False, 1 = True)
        boolean bool = true;
        System.out.println("bool is: " + bool);

    }

}
