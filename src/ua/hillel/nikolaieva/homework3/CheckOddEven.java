/*Написати метод з назвою "CheckOddEven", яка друкує "Odd Number", якщо змінна "number" типу int непарна.
Або "Even Number" якщо змінна парна. Програма завжди має перед виходом друкувати “BYE”*/

package ua.hillel.nikolaieva.homework3;
import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a number:");
            int number = in.nextInt();

            System.out.println(getNumber(number));

            in.close();
    }

    public static String getNumber (int number) {

        if (number % 2 == 0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
        return "BYE!";
    }
}
