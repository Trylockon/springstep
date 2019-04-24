package bab.lec.springstep.services.interfaces.Client;

import bab.lec.springstep.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IClientService{
    Client create(Client client);
    Client get(String id);
    Client update(Client client);
    Client delete(String id);
    List<Client> getAll();
}
