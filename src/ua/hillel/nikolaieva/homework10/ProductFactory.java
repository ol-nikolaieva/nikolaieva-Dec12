package ua.hillel.nikolaieva.homework10;

public  class ProductFactory {

    public static int groceriesProductsCounter = 0;
    public static int otherProductsCounter = 0;

    public static Grocery CreateGroceryProduct (String productTitle, String bestBeforeDate) {
        Grocery grocery = new Grocery(productTitle, bestBeforeDate);
        groceriesProductsCounter++;
        return grocery;
    };

    public static Other CreateOtherProduct (String productTitle, String warrantyPeriod) {
        Other other = new Other (productTitle, warrantyPeriod);
        otherProductsCounter++;
        return other;
    };


}
