package ua.hillel.nikolaieva.homework10;

public class Grocery extends Product {
    protected String bestBeforeDate;
    protected static int productCounter = 0;

    public Grocery(String productTitle, String bestBeforeDate){
        super(productTitle);
        this.bestBeforeDate = bestBeforeDate;
        productCounter++;
    }
}
