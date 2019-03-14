package bab.lec.springstep.DAO.impls.Client;

import bab.lec.springstep.DAO.interfaces.Client.IClientDAO;
import bab.lec.springstep.model.Client;
import bab.lec.springstep.model.OrderBook;
import bab.lec.springstep.model.Sale;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//private String clientId;
//private String name;
//private LocalDate dateOfBirth;
//private long phoneNumber;
//private String email;
//private OrderBook orderBook;


public class ClientDAOImpl implements IClientDAO {

    private List<Client> clients = new ArrayList<>(
            Arrays.asList(
                    new Client("a1","Alex Johnson",
                            LocalDate.of(1989,03,14),0660300422,"a@ds.cs",
                            new OrderBook("a1", new Sale("c22","c2","2x"
                            ,LocalDate.of(2019,03,14),LocalDate.of(2019,03,10),1))),
             new Client("a2","Alex Bohnson",
                        LocalDate.of(1985,02,11),0660300422,"b@sa.gs",
            new OrderBook("a12", new Sale("c232","c12","22x"
            ,LocalDate.of(2019,03,14),LocalDate.of(2019,03,10),1)))
            )
    );

    @Override
    public Client create(Client client) {
        return new Client(client);
    }

    @Override
    public Client get(String id) {
        return clients.stream()
                .filter(client -> client.getClientId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public Client update(Client client) {
        
        return client;
    }

    @Override
    public Client delete(String id) {
        Client client = clients.stream()
                .filter(client1 -> client1.getClientId() == id)
                .findFirst().orElse(null);
        clients.remove(client);
        return client;
    }

    @Override
    public List<Client> getAll() {
        return clients;
    }
}
