// Написати метод, який визначає, чи є трикутник зі сторонами a, b, c рівнобедреним

package ua.hillel.nikolaieva.homework3;
import java.util.Scanner;

public class EquilateralTriangleChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a length of A side:");
        float a = in.nextFloat();

        System.out.println("Please enter a length of B side:");
        float b = in.nextFloat();

        System.out.println("Please enter a length of C side:");
        float c = in.nextFloat();

        System.out.println(compareSides(a, b, c));

        in.close();
    }

    public static String compareSides (float a, float b, float c) {
        if (a == b || a == c || b == c) {
            return "Yes, this is an equilateral triangle";
        }
        else {
            return "No, this is not an equilateral triangle";
        }
    }
}
