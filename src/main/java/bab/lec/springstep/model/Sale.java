package bab.lec.springstep.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Objects;

@Document
public class Sale {
    @Id
    private String saleId;
    private Product product;
    private LocalDate dateOfSale;
    private LocalDate dateOfDelivery;
    private int quantity;
    //Продажу (Код продажу, Код товару, Код клієнта, Дата продажу, Дата доставки, Кількість).


    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public Product getProductId() {
        return product;
    }

    public void setProductId(Product productId) {
        this.product = productId;
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

    public Sale(String saleId, Product product, LocalDate dateOfSale, LocalDate dateOfDelivery, int quantity) {
        this.saleId = saleId;
        this.product = product;
        this.dateOfSale = dateOfSale;
        this.dateOfDelivery = dateOfDelivery;
        this.quantity = quantity;
    }

    public Sale() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sale)) return false;
        Sale sale = (Sale) o;
        return getSaleId().equals(sale.getSaleId());
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId='" + saleId + '\'' +
                ", product=" + product +
                ", dateOfSale=" + dateOfSale +
                ", dateOfDelivery=" + dateOfDelivery +
                ", quantity=" + quantity +
                '}';
    }

    public Sale(Product product, Client client, LocalDate dateOfSale, LocalDate dateOfDelivery, int quantity) {
        this.product = product;
        this.dateOfSale = dateOfSale;
        this.dateOfDelivery = dateOfDelivery;
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSaleId());
    }
}
