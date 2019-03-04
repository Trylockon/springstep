package bab.lec.springstep.model;

public class Client {
 private String id;
 private String name;
 private String dateOfBirth;
 private int phoneNumber;
 private String email;

 public Client() {
 }

 public Client(String id, String name, String dateOfBirth, int phoneNumber, String email) {
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
          ", dateOfBirth='" + dateOfBirth + '\'' +
          ", phoneNumber=" + phoneNumber +
          ", email='" + email + '\'' +
          '}';
 }


}
