package bab.lec.springstep.services.interfaces.Client;

import bab.lec.springstep.model.Client;

import java.util.List;

public interface IClientService{
    Client create(Client client);
    Client get(String id);
    Client update(Client client);
    void delete(String id);
    List<Client> getAll();
}
