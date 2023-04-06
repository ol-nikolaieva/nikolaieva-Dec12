package ua.hillel.nikolaieva.homework12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapesList = new ArrayList<>();

        while (true) {
            System.out.println("Enter the name of the shape you would like to add: ");
            String shapeName = scanner.nextLine();

            switch (shapeName.toLowerCase()) {
                case "circle":
                    System.out.println("Enter the radius of the circle in cm:");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    shapesList.add(circle);
                    break;
                case "triangle":
                    System.out.println("Enter the length of side 1 of the triangle in cm:");
                    double side1 = scanner.nextDouble();
                    System.out.println("Enter the length of side 2 of the triangle in cm:");
                    double side2 = scanner.nextDouble();
                    System.out.println("Enter the length of side 3 of the triangle in cm:");
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(side1, side2, side3);
                    shapesList.add(triangle);
                    break;
                case "square":
                    System.out.println("Enter the length of a side of the square in cm:");
                    double squareSide = scanner.nextDouble();
                    Square square = new Square(squareSide);
                    shapesList.add(square);
                    break;
                case "parallelepiped":
                    System.out.println("Enter the length of the parallelepiped in cm:");
                    double parallelepipedLength = scanner.nextDouble();
                    System.out.println("Enter the width of the parallelepiped in cm:");
                    double parallelepipedWidth = scanner.nextDouble();
                    System.out.println("Enter the height of the parallelepiped in cm:");
                    double parallelepipedHeight = scanner.nextDouble();
                    Parallelepiped parallelepiped = new Parallelepiped(parallelepipedLength, parallelepipedWidth, parallelepipedHeight);
                    shapesList.add(parallelepiped);
                    break;
                default:
                    System.out.println("Invalid shape name. Please, try again.");
                    continue;
            }
            scanner.nextLine();

            System.out.println("Would you like to add a new shape (yes or no)?");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")){
                break;
            }
        }

        Collections.sort(shapesList, new Comparator<Shape>() {
            @Override
            public int compare(Shape shape1, Shape shape2) {
                double area1 = shape1.getArea();
                double area2 = shape2.getArea();
                if (area1 != area2) {
                    return Double.compare(area2, area1);
                } else {
                    double perimeter1 = shape1.getPerimeter();
                    double perimeter2 = shape2.getPerimeter();
                    return Double.compare(perimeter2, perimeter1);
                }
            }
        });

        System.out.println("============= Figure list: ===============");
        for (int i = 0; i < shapesList.size(); i++) {
            Shape shape = shapesList.get(i);
            double area = shape.getArea();
            double perimeter = shape.getPerimeter();
            System.out.println((i + 1) + ". [" + shape.getClass().getSimpleName() + "]: Area = " + String.format("%.2f", area) + " cm; Perimeter = " + String.format("%.2f", perimeter) + " cm.");
        }
    }
}

