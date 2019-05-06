package bab.lec.springstep.forms;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class OrderBookForm {
    @Id
    private String Id;
    private String Sale;

    @Override
    public String toString() {
        return "OrderBookForm{" +
                "Id='" + Id + '\'' +
                ", Sale='" + Sale + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderBookForm)) return false;
        OrderBookForm that = (OrderBookForm) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getId() {
        return Id;
    }

    public OrderBookForm() {
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSale() {
        return Sale;
    }

    public void setSale(String sale) {
        Sale = sale;
    }

    public OrderBookForm(String sale) {
        Sale = sale;
    }

    public OrderBookForm(String id, String sale) {
        Id = id;
        Sale = sale;
    }
}
