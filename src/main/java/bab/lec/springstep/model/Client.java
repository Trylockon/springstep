package bab.lec.springstep.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document
public class Client {
 @Id
 private String id;
 private String name;
 private LocalDate dateOfBirth;
 private int phoneNumber;
 private String email;
 private OrderBook orderBook;

 public Client(Client client) {
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

 public LocalDate getDateOfBirth() {
  return dateOfBirth;
 }

 public void setDateOfBirth(LocalDate dateOfBirth) {
  this.dateOfBirth = dateOfBirth;
 }

 public int getPhoneNumber() {
  return phoneNumber;
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

 public OrderBook getOrderBook() {
  return orderBook;
 }

 public void setOrderBook(OrderBook orderBook) {
  this.orderBook = orderBook;
 }

 public Client(String id, String name, LocalDate dateOfBirth, int phoneNumber, String email) {
  this.id = id;
  this.name = name;
  this.dateOfBirth = dateOfBirth;
  this.phoneNumber = phoneNumber;
  this.email = email;
 }

 @Override
 public String toString() {
  return "Client{" +
          "id='" + id + '\'' +
          ", name='" + name + '\'' +
          ", dateOfBirth=" + dateOfBirth +
          ", phoneNumber=" + phoneNumber +
          ", email='" + email + '\'' +
          ", orderBook=" + orderBook +
          '}';
 }

 public Client(String name, LocalDate dateOfBirth, int phoneNumber, String email, OrderBook orderBook) {
  this.name = name;
  this.dateOfBirth = dateOfBirth;
  this.phoneNumber = phoneNumber;
  this.email = email;
  this.orderBook = orderBook;
 }

 public Client(String name, LocalDate dateOfBirth, int phoneNumber, String email) {
  this.name = name;
  this.dateOfBirth = dateOfBirth;
  this.phoneNumber = phoneNumber;
  this.email = email;
 }

 public Client(String id, String name, LocalDate dateOfBirth, int phoneNumber, String email, OrderBook orderBook) {
  this.id = id;
  this.name = name;
  this.dateOfBirth = dateOfBirth;
  this.phoneNumber = phoneNumber;
  this.email = email;
  this.orderBook = orderBook;
 }

 public Client() {
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (!(o instanceof Client)) return false;
  Client client = (Client) o;
  return getId().equals(client.getId());
 }

 @Override
 public int hashCode() {
  return Objects.hash(getId());
 }
}


