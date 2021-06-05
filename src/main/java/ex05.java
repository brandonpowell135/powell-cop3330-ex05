/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Brandon Powell
 */
/*
Exercise 5 - Simple Math

You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output

What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints

Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Don’t allow the user to enter a negative number.
Break the program into functions that do the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
*/
import java.util.Scanner;
public class ex05 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){

        System.out.print("What is the first number? ");
        String str1 = in.nextLine();
        int number1 = Integer.parseInt(str1);

        System.out.print("What is the second number? ");
        String str2 = in.nextLine();
        int number2 =Integer.parseInt(str2);

        int results1 = number1+number2;
        int results2 = number1-number2;
        int results3 = number1*number2;
        int results4 = number1/number2;

        System.out.println(String.format("%d + %d = %d",number1, number2, results1));
        System.out.println(String.format("%d - %d = %d",number1, number2, results2));
        System.out.println(String.format("%d * %d = %d",number1, number2, results3));
        System.out.println(String.format("%d / %d = %d",number1, number2, results4));
    }
}
