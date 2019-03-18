package bab.lec.springstep.data;

import bab.lec.springstep.model.Client;
import bab.lec.springstep.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeDataSource {
    List<Product> products = new ArrayList(
            Arrays.asList(
                    new Product()
            )
    );

    List<Client> clients = new ArrayList(
            Arrays.asList(
                    new Client()
            )
    );
}
