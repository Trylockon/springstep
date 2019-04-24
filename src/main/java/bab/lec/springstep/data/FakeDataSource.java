package bab.lec.springstep.data;

import bab.lec.springstep.model.Client;
import bab.lec.springstep.model.OrderBook;
import bab.lec.springstep.model.Product;
import bab.lec.springstep.model.Sale;
import bab.lec.springstep.repository.ClientRepository;
import bab.lec.springstep.repository.OrderBookRepository;
import bab.lec.springstep.repository.ProductRepository;
import bab.lec.springstep.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class FakeDataSource {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    OrderBookRepository orderBookRepository;

    private List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product("IBN1019",1000,"kg",8),
                    new Product("NiO3",1250,"kg",1000),
                    new Product("UPhonyXS",1500,"kg",1),
                    new Product("MsSurfaceStudioNoob",2500,"kg",5)
            )
    );

    private List<Client> clients = new ArrayList<>(
            Arrays.asList(
                    new Client("Alexandr Suhojilov", LocalDate.of(1982,12,29),06633344455,"alexzasuha@gmail.com"),
                    new Client("Michail Surkov", LocalDate.of(1975,7,12),04644455566,"michailtotalmess@mailru"),
                    new Client("Nick Okhranyk", LocalDate.of(2000,11,5),569990033,"exaduratedskill@ukr.net"),
                    new Client("John Snow", LocalDate.of(1993,3,15),785553312,"iknowsothening@gmail.com")
            )
    );
    private List<Sale> sales = new ArrayList<>(
            Arrays.asList(
                   new Sale(products.get(0),clients.get(0), LocalDate.now().minusDays(7),LocalDate.now(),2),
                   new Sale(products.get(1),clients.get(1), LocalDate.of(2017,11,11)
                           ,LocalDate.of(2017,11,16),1),
                   new Sale(products.get(3),clients.get(2), LocalDate.of(2018,4,12)
                           ,LocalDate.of(2018,5,1),5),
                   new Sale(products.get(2),clients.get(3), LocalDate.of(2019,03,10)
                           ,LocalDate.of(2019,03,15),2)
            )
    );
    private List<OrderBook> orderBooks = new ArrayList<>(
            Arrays.asList(
                    new OrderBook(sales.get(0)),
                    new OrderBook(sales.get(1)),
                    new OrderBook(sales.get(2)),
                    new OrderBook(sales.get(3))
            )
    );

    public List<Product> getProducts() {
        return products;
    }
    public List<Client> getClients() {
        return clients;
    }
    public List<Sale> getSales() {
        return sales;
    }

    @PostConstruct
    void init() {
        productRepository.deleteAll();
        productRepository.saveAll(products);
        clientRepository.deleteAll();
        clientRepository.saveAll(clients);
        saleRepository.deleteAll();
        saleRepository.saveAll(sales);
        orderBookRepository.deleteAll();
        orderBookRepository.saveAll(orderBooks);
    }
}
