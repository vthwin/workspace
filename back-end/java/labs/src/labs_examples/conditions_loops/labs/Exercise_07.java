package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a word to find the first vowel: ");
            boolean foundVowel = false;
            String word = input.nextLine();
            for (char c: word.toLowerCase().toCharArray()) {
                char vowel;
                switch (c) {
                    case 'a':
                        vowel = 'a';
                        break;
                    case 'e':
                        vowel = 'e';
                        break;
                    case 'i':
                        vowel = 'i';
                        break;
                    case 'o':
                        vowel = 'o';
                        break;
                    case 'u':
                        vowel = 'u';
                        break;
                    default:
                        continue;
                }
                foundVowel = true;
                System.out.println("The word is " + word +": the vowel found is " + vowel);
                break;
            }
            if (!foundVowel) {
                System.out.println("We did not find a vowel.");
            }
        }
    }
}
