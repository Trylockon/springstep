package bab.lec.springstep.DAO.interfaces.Client;

import bab.lec.springstep.model.Client;

import java.util.List;

public interface IClientDAO {
    public Client create(Client client);
    public Client get(String id);
    public  Client update(Client client);
    public  Client delete(String id);
    public List<Client> getAll();
}
