package bab.lec.springstep.model;

import java.util.List;

public class Journal {
    private String journalId;
    private List<Order> orders;

    public Journal() {
    }

    public Journal(String journalId, List<Order> orders) {
        this.journalId = journalId;
        this.orders = orders;
    }

    public String getJournalId() {
        return journalId;
    }

    public void setJournalId(String journalId) {
        this.journalId = journalId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "journalId='" + journalId + '\'' +
                ", orders=" + orders +
                '}';
    }
}
