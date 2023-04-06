package ua.hillel.nikolaieva.homework10;

public class Grocery extends Product {
    protected String bestBeforeDate;
    private static int productCounter = 0;

    public Grocery(String productTitle, String bestBeforeDate){
        super(productTitle);
        this.bestBeforeDate = bestBeforeDate;
        productCounter++;
    }

    public static int getGroceriesProductsCounter() {
        return productCounter;
    }
}
