package bab.lec.springstep.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class OrderBook {
    @Id
    private String id;
    private Sale sale;

    public OrderBook(Sale sale) {
        this.sale = sale;
    }

    public OrderBook() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderBook)) return false;
        OrderBook orderBook = (OrderBook) o;
        return Objects.equals(getId(), orderBook.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public OrderBook(String id, Sale sale) {
        this.id = id;
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "OrderBook{" +
                "id='" + id + '\'' +
                ", sale=" + sale +
                '}';
    }
}
