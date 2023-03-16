package ua.hillel.nikolaieva.homework10;

public  class ProductFactory {

    private static int groceriesProductsCounter = 0;
    private static int otherProductsCounter = 0;

    public static Grocery CreateGroceryProduct (String productTitle, String bestBeforeDate) {
        Grocery grocery = new Grocery(productTitle, bestBeforeDate);
        groceriesProductsCounter++;
        return grocery;
    };

    public static int getGroceriesProductsCounter (){
       return groceriesProductsCounter;
    };

    public static Other CreateOtherProduct (String productTitle, String warrantyPeriod) {
        Other other = new Other (productTitle, warrantyPeriod);
        otherProductsCounter++;
        return other;
    };

    public static int getOtherProductsCounter (){
        return otherProductsCounter;
    };


}
