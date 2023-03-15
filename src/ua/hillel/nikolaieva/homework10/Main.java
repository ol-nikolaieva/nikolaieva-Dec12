package ua.hillel.nikolaieva.homework10;

import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {


        /**instances creation using constructors*/
        Product groceryProduct1 = new Grocery("Buffalo Style Chicken Wings", "7 діб");
        Product groceryProduct2 = new Grocery("Baby spinach ", "14 діб");
        Product otherProduct1 = new Other("Trash bin", "2 роки");

        System.out.println("Загалом створено " + Grocery.productCounter + " продуктових товарів");
        System.out.println("Загалом створено " + Other.productCounter + " непродовольчих товарів");

        /**instances creation using ProductFactory*/
        Product groceryProduct3 = ProductFactory.CreateGroceryProduct("Bread",  "3 доби");
        Product otherProduct2 = ProductFactory.CreateOtherProduct("PlayStation 5", "1 рік");
        Product otherProduct3 = ProductFactory.CreateOtherProduct("Xbox", "1 рік");


        System.out.println("Фабрика створила " + ProductFactory.groceriesProductsCounter + " продуктових товарів");
        System.out.println("Фабрика створила " + ProductFactory.otherProductsCounter + " непродовольчих товарів");



    }
}
