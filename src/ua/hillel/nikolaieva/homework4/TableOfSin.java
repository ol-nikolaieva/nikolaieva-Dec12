//Написати програму, яка друкує таблицю значень sin(x), де x це кожні 10 градусів від 0 до 360
package ua.hillel.nikolaieva.homework4;

public class TableOfSin {

    public static void main(String[] args) {
        int x = 0;
        while (x < 360){
            x += 10;
            System.out.println("sin(" + x + ") is: " + java.lang.Math.sin(x));
        }
        
    }

}
