package bab.lec.springstep.services.impls.Client;

import bab.lec.springstep.model.Client;
import bab.lec.springstep.repository.ClientRepository;
import bab.lec.springstep.services.interfaces.Client.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientMongoServiceImpl implements IClientService {
    @Autowired
    ClientRepository repository;

    @Override
    public Client create(Client client) {
        return this.repository.save(client);
    }

    @Override
    public Client get(String id) {

        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Client update(Client client) {
        return this.repository.save(client);
    }

    @Override
    public void delete(String id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<Client> getAll() {
        return this.repository.findAll();
    }
}
