/*Написати метод з назвою "printMonthInWord", яка друкує "JAN",
"FEB", …. “DEC”, якщо змінна “month” типу int буде 1, 2, 3, 4...12.
в іншому випадку програма повинна вивести “Not a valid month”. Розв'язати задачу двома
способами: 1) з використанням if..else if 2) з використанням switch-case*/

package ua.hillel.nikolaieva.homework3;
import java.util.Scanner;

public class PrintMonthInWord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a month number:");
        int monthNumber = in.nextInt();

        System.out.println(getMonthIfElse(monthNumber));
        System.out.println(getMonthSwitch(monthNumber));

        in.close();
    }


    public static String getMonthIfElse (int monthNumber) {
        if (monthNumber == 1) {
            return "January";
        }
        else if (monthNumber == 2) {
            return "February";
        }
        else if (monthNumber == 3) {
            return "March";
        }
        else if (monthNumber == 4) {
            return "April";
        }
        else if (monthNumber == 5) {
            return "May";
        }
        else if (monthNumber == 6) {
            return "June";
        }
        else if (monthNumber == 7) {
            return "July";
        }
        else if (monthNumber == 8) {
            return "August";
        }
        else if (monthNumber == 9) {
            return "September";
        }
        else if (monthNumber == 10) {
            return "October";
        }
        else if (monthNumber == 11) {
            return "November";
        }
        else if (monthNumber == 12) {
            return "December";
        }
        else {
            return "Not a valid month. Please try again";
        }
    }

    public static String getMonthSwitch (int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Not a valid month. Please try again";
        };
    }
}
