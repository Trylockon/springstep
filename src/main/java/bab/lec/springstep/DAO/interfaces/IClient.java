package bab.lec.springstep.DAO.interfaces;

import bab.lec.springstep.model.Client;

import java.util.List;

public interface IClient {
    void create(Client client);
    Client read(int clientId);
    void update(Client client, int clientId);
    void delete(int clientId);
    List<Client> readAll();
}
