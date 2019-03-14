package bab.lec.springstep.model;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Objects;

public class Sale {
    private String saleId;
    private String productId;
    private String clientId;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    public Sale(String saleId, String productId, String clientId, LocalDate dateOfSale, LocalDate dateOfDelivery, int quantity) {
        this.saleId = saleId;
        this.productId = productId;
        this.clientId = clientId;
        this.dateOfSale = dateOfSale;
        this.dateOfDelivery = dateOfDelivery;
        this.quantity = quantity;
    }

    public Sale() {
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId='" + saleId + '\'' +
                ", productId='" + productId + '\'' +
                ", clientId='" + clientId + '\'' +
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
        return getSaleId().equals(sale.getSaleId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSaleId());
    }
}
