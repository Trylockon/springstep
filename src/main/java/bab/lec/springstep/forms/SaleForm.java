package bab.lec.springstep.forms;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document
public class SaleForm {
        @Id
        private String id;
        private String product;
        private String dateOfSale;
        private String dateOfDelivery;
        private int quantity;

    public SaleForm(String product, String dateOfSale, String dateOfDelivery, int quantity) {
        this.product = product;
        this.dateOfSale = dateOfSale;
        this.dateOfDelivery = dateOfDelivery;
        this.quantity = quantity;
    }

    public SaleForm(String id, String product, String dateOfSale, String dateOfDelivery, int quantity) {
        this.id = id;
        this.product = product;
        this.dateOfSale = dateOfSale;
        this.dateOfDelivery = dateOfDelivery;
        this.quantity = quantity;
    }

    public SaleForm() {
    }


    @Override
    public String toString() {
        return "SaleForm{" +
                "id='" + id + '\'' +
                ", product='" + product + '\'' +
                ", dateOfSale=" + dateOfSale +
                ", dateOfDelivery=" + dateOfDelivery +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleForm)) return false;
        SaleForm saleForm = (SaleForm) o;
        return Objects.equals(getId(), saleForm.getId());
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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public String getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(String dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
