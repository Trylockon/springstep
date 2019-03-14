package bab.lec.springstep.DAO.interfaces.Product;

import bab.lec.springstep.model.Product;

import java.util.List;

public interface IProductDAO {
    public Product create(Product product);
    public Product get(String id);
    public  Product update(Product client);
    public  Product delete(String id);
    public List<Product> getAll();
}
