package bab.lec.springstep.forms;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class ProductForm {
    @Id
    private String Id;
    private String name;
    private double price;
    private String measure;
    private int valueOfMeasure;


    @Override
    public String toString() {
        return "ProductForm{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", measure='" + measure + '\'' +
                ", valueOfMeasure=" + valueOfMeasure +
                '}';
    }

    public ProductForm() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductForm)) return false;
        ProductForm product = (ProductForm) o;
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ProductForm(String name, double price, String measure, int valueOfMeasure) {
        this.name = name;
        this.price = price;
        this.measure = measure;
        this.valueOfMeasure = valueOfMeasure;
    }

    public ProductForm(String id, String name, double price, String measure, int valueOfMeasure) {
        Id = id;
        this.name = name;
        this.price = price;
        this.measure = measure;
        this.valueOfMeasure = valueOfMeasure;
    }
}

