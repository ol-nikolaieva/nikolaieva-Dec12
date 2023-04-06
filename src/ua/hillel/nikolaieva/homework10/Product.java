package ua.hillel.nikolaieva.homework10;
import java.time.LocalDateTime;

public abstract class Product {

    public String productTitle;
    public LocalDateTime productionDate;

    public Product(String productTitle) {
        this.productTitle = productTitle;
        this.productionDate = LocalDateTime.now();
    };
}
