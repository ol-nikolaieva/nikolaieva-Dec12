package ua.hillel.nikolaieva.homework2;
import java.util.Scanner;

public class CelsiusToFahrenheitAndKelvin {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть значення в Цельсіях");
        float X = in.nextFloat();

        //Celsius to Fahrenheit
        float Y = (float) (X * 1.8 +32);
        //Celsius to Kelvin
        float Z = (float) (X + 273.16);

        System.out.println(X + " C; " + Y + " F; " + Z + " K;");
        in.close();
    }

}