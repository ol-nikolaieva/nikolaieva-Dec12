package ua.hillel.nikolaieva.homework10;

import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {


        /**instances creation using constructors*/
        Product groceryProduct1 = new Grocery("Курячі крильця", "7 діб");
        Product groceryProduct2 = new Grocery("Шпинат", "14 діб");
        Product otherProduct1 = new Other("Відро", "2 роки");

        System.out.println("Загалом створено " + Grocery.getGroceriesProductsCounter() + " продуктових товарів");
        System.out.println("Загалом створено " + Other.getOtherProductsCounter() + " непродовольчих товарів");

        /**instances creation using ProductFactory*/
        Product groceryProduct3 = ProductFactory.CreateGroceryProduct("Хліб",  "3 доби");
        Product otherProduct2 = ProductFactory.CreateOtherProduct("PlayStation 5", "1 рік");
        Product otherProduct3 = ProductFactory.CreateOtherProduct("Xbox", "1 рік");


        System.out.println("Фабрика створила " + ProductFactory.getGroceriesProductsCounter() + " продуктових товарів");
        System.out.println("Фабрика створила " + ProductFactory.getOtherProductsCounter() + " непродовольчих товарів");



    }
}
