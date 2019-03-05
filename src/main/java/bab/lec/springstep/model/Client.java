package bab.lec.springstep.model;

public class Client {
 private String clientId;
 private String clientName;
 private String dateOfBirth;
 private int phoneNumber;
 private String email;

 public Client() {
 }

 public Client(String clientId, String clientName, String dateOfBirth, int phoneNumber, String email) {
  this.clientId = clientId;
  this.clientName = clientName;
  this.dateOfBirth = dateOfBirth;
  this.phoneNumber = phoneNumber;
  this.email = email;
 }

 @Override
 public String toString() {
  return "Client{" +
          "id='" + clientId + '\'' +
          ", name='" + clientName + '\'' +
          ", dateOfBirth='" + dateOfBirth + '\'' +
          ", phoneNumber=" + phoneNumber +
          ", email='" + email + '\'' +
          '}';
 }


}
