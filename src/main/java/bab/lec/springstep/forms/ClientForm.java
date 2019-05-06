package bab.lec.springstep.forms;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document
public class ClientForm {
        @Id
        private String id;
        private String name;
        private String dateOfBirth;
        private int phoneNumber;
        private String email;
        private String orderBook;

    public ClientForm() {
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderBook() {
        return orderBook;
    }

    public void setOrderBook(String orderBook) {
        this.orderBook = orderBook;
    }

    public ClientForm(String id, String name, String dateOfBirth, int phoneNumber, String email, String orderBook) {
            this.id = id;
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.orderBook = orderBook;
        }

    public ClientForm(String name, String dateOfBirth, int phoneNumber, String email, String orderBook) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.orderBook = orderBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientForm)) return false;
        ClientForm that = (ClientForm) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ClientForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", orderBook='" + orderBook + '\'' +
                '}';
    }
}
