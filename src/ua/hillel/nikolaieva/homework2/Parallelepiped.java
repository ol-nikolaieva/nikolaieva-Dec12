package ua.hillel.nikolaieva.homework2;
import java.util.Scanner;

public class Parallelepiped {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть довжину сторони а в сантиметрах:");
        int a = in.nextInt();

        System.out.println("Введіть довжину сторони b в сантиметрах:");
        int b = in.nextInt();

        System.out.println("Введіть довжину сторони c в сантиметрах:");
        int c = in.nextInt();

        int volume = a * b * c;
        int length = a + b + c;

        System.out.println( "Обʼєм паралелепіпеда = " + volume + " см");
        System.out.println( "Довжина сторін = " + length + " см");
        in.close();
    }

}
