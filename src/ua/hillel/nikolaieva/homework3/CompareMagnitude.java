/*Написати метод якій порівнюватиме величину (magnitude) двох чисел.
Наприклад, якщо одне число = 3, а друге число = -9, програма має видати, що число -9 має велику величину.
Для обчислення абсолютного значення можна використовувати метод із стандартної бібліотеки Math.abs()*/
package ua.hillel.nikolaieva.homework3;
import java.util.Scanner;

public class CompareMagnitude {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a first number:");
        int firstNumber = in.nextInt();

        System.out.println("Please enter a second number:");
        int secondNumber = in.nextInt();

        System.out.println(compareNumbersMagnitude(firstNumber, secondNumber));

        in.close();
    }

    public static String compareNumbersMagnitude (int firstNumber, int secondNumber) {
        if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
            return (firstNumber + " magnitude is bigger than " + secondNumber);
        }
        else if (Math.abs(secondNumber) > Math.abs(firstNumber)){
            return (secondNumber + " magnitude is bigger than " + firstNumber);
        }
        else  {
            return (firstNumber + " and " + secondNumber + " magnitudes are equal");
        }
    }
}
