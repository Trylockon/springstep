package bab.lec.springstep.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Product {
    @Id
    private String productId;
    private  String productName;
    private double price;
    private String measure;
    private int valueOfMeasure;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public int getValueOfMeasure() {
        return valueOfMeasure;
    }

    public void setValueOfMeasure(int valueOfMeasure) {
        this.valueOfMeasure = valueOfMeasure;
    }

    public Product(String productId, String productName, double price, String measure, int valueOfMeasure) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.measure = measure;
        this.valueOfMeasure = valueOfMeasure;
    }

    public Product() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 &&
                getValueOfMeasure() == product.getValueOfMeasure() &&
                getProductId().equals(product.getProductId()) &&
                Objects.equals(getProductName(), product.getProductName()) &&
                Objects.equals(getMeasure(), product.getMeasure());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId());
    }
}


