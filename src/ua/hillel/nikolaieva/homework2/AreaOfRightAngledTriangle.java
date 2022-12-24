package ua.hillel.nikolaieva.homework2;
import java.util.Scanner;

public class AreaOfRightAngledTriangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть довжину сторони а в сантиметрах:");
        float a = in.nextFloat();

        System.out.println("Введіть довжину сторони b в сантиметрах:");
        float b = in.nextFloat();

        float S = a * b / 2;

        System.out.println( "Площа прямокутного трикутника зі сторонами " + a + " см та " + b + " см складає " + S + " см^2");
        in.close();
    }

}
