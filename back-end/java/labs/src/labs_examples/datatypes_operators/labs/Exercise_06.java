package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        calculateVolumeAndSurfaceArea(3.14f, 5);

    }

    public static void calculateVolumeAndSurfaceArea(float radius, int height) {
        final float PI = 3.14f;
        System.out.println("The volume is: " + (PI * radius * radius * height));
        System.out.println("The surface area is: " + ((2 * PI * radius * height) + (2 * PI * radius * radius)));
    }
}