package bab.lec.springstep.model;

public class Product {
    private String id;
    private  String productName;
    private double price;
    private String measure;
    private int valueOfMeasure;

    public Product() {
    }

    public Product(String id, String productName, double price, String measure, int valueOfMeasure) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.measure = measure;
        this.valueOfMeasure = valueOfMeasure;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", measure='" + measure + '\'' +
                ", valueOfMeasure=" + valueOfMeasure +
                '}';
    }
}
