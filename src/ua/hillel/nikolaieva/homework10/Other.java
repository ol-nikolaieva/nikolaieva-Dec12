package ua.hillel.nikolaieva.homework10;

public class Other extends Product {
    protected String warrantyPeriod;
    private static int productCounter = 0;

    public Other(String productTitle, String warrantyPeriod){
        super(productTitle);
        this.warrantyPeriod = warrantyPeriod;
        productCounter++;
    }

    public static int getOtherProductsCounter () {
        return productCounter;
    }
}
