package bab.lec.springstep.model;

import org.apache.tomcat.jni.Local;

import java.text.DateFormat;
import java.time.LocalDate;

public class Order {
    private int orderId;
    private int productId;
    private int clientId;
    private String dateOfSale;
    private LocalDate dateOfDelivery;
    private int quantity;

    public Order() {
    }

    public Order(int saleId, int productId, int clientId, String dateOfSale, LocalDate dateOfDelivery, int quantity) {
        this.orderId = saleId;
        this.productId = productId;
        this.clientId = clientId;
        this.dateOfSale = dateOfSale;
        this.dateOfDelivery = dateOfDelivery;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + orderId +
                ", productId=" + productId +
                ", clientId=" + clientId +
                ", dateOfSale='" + dateOfSale + '\'' +
                ", dateOfDelivery='" + dateOfDelivery + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
