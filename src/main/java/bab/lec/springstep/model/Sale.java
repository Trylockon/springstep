package bab.lec.springstep.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Objects;

@Document
public class Sale {
    @Id
    private String id;
    private Product product;
    private LocalDate dateOfSale;
    private LocalDate dateOfDelivery;
    private int quantity;
    //Продажу (Код продажу, Код товару, Код клієнта, Дата продажу, Дата доставки, Кількість).

    @Override
    public String toString() {
        return "Sale{" +
                "id='" + id + '\'' +
                ", product=" + product +
                ", dateOfSale=" + dateOfSale +
                ", dateOfDelivery=" + dateOfDelivery +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sale)) return false;
        Sale sale = (Sale) o;
        return Objects.equals(getId(), sale.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(LocalDate dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public LocalDate getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(LocalDate dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Sale() {
    }

    public Sale(Product product, LocalDate dateOfSale, LocalDate dateOfDelivery, int quantity) {
        this.product = product;
        this.dateOfSale = dateOfSale;
        this.dateOfDelivery = dateOfDelivery;
        this.quantity = quantity;
    }

    public Sale(String id, Product product, LocalDate dateOfSale, LocalDate dateOfDelivery, int quantity) {
        this.id = id;
        this.product = product;
        this.dateOfSale = dateOfSale;
        this.dateOfDelivery = dateOfDelivery;
        this.quantity = quantity;
    }
}
