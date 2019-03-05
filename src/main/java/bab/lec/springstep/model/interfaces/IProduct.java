package bab.lec.springstep.model.interfaces;

import bab.lec.springstep.model.Product;

import java.util.List;

public interface IProduct {
    void create(Product product);
    Product read(int productId);
    void update(Product product, int productId);
    void delete(int productId);
    List<Product> readAll();
}
