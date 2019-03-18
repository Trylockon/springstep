package bab.lec.springstep.services.impls.Product;

import bab.lec.springstep.model.Product;
import bab.lec.springstep.repository.ProductRepository;
import bab.lec.springstep.services.interfaces.Product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductMongoServiceImpl implements IProductService {
    @Autowired
    ProductRepository repository;

    @Override
    public Product create(Product product) {
        return this.repository.save(product);
    }

    @Override
    public Product get(String id) {

        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Product update(Product product) {
        return this.repository.save(product);
    }

    @Override
    public Product delete(String id) {
        return this.delete(id);
    }

    @Override
    public List<Product> getAll() {
        return this.repository.findAll();
    }
}
