package exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        StdOut.println("Enter first number:");
        int x = StdIn.readInt();
        StdOut.println("Enter second number:");
        int y = StdIn.readInt();

        StdOut.printf("Greatest common divisor is %d\r\n", findGreatestCommonDivisor(x, y));
    }

    public static int findGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }

        int newSecondNumber = firstNumber % secondNumber;

        return findGreatestCommonDivisor(secondNumber, newSecondNumber);
    }
}
