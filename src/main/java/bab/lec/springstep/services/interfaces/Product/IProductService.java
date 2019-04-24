package bab.lec.springstep.services.interfaces.Product;

import bab.lec.springstep.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductService {
        Product create(Product product);
        Product get(String id);
        Product update(Product product);
        Product delete(String id);
        List<Product> getAll();
}
