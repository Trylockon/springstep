package bab.lec.springstep.model;

public class Product {
    private String productId;
    private  String productName;
    private double price;
    private String measure;
    private int valueOfMeasure;

    public Product() {
    }

    public Product(String productId, String productName, double price, String measure, int valueOfMeasure) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.measure = measure;
        this.valueOfMeasure = valueOfMeasure;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", measure='" + measure + '\'' +
                ", valueOfMeasure=" + valueOfMeasure +
                '}';
    }
}
