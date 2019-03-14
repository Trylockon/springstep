package bab.lec.springstep.model;

import java.util.Objects;

public class OrderBook {
    private String entryId;
    private Sale sale;


    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public OrderBook() {
    }

    public OrderBook(String entryId, Sale sale) {
        this.entryId = entryId;
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "OrderBook{" +
                "entryId='" + entryId + '\'' +
                ", sale=" + sale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderBook)) return false;
        OrderBook orderBook = (OrderBook) o;
        return getEntryId().equals(orderBook.getEntryId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEntryId());
    }
}


