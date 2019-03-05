package bab.lec.springstep.model;

import org.apache.tomcat.jni.Local;

import java.text.DateFormat;
import java.time.LocalDate;

public class Order {
    private int orderId;
    private Client client;
    private Product product;
    private LocalDate dateOfSale;
    private LocalDate dateOfDelivery;
    private int quantity;

    public Order() {
    }

    public Order(int saleId, Product product, Client client, LocalDate dateOfSale, LocalDate dateOfDelivery, int quantity) {
        this.orderId = saleId;
        this.product = product;
        this.client = client;
        this.dateOfSale = dateOfSale;
        this.dateOfDelivery = dateOfDelivery;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", client=" + client +
                ", product=" + product +
                ", dateOfSale=" + dateOfSale +
                ", dateOfDelivery=" + dateOfDelivery +
                ", quantity=" + quantity +
                '}';
    }
}
