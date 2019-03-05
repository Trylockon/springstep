package bab.lec.springstep.model.impls;

import bab.lec.springstep.model.Product;
import bab.lec.springstep.model.interfaces.IProduct;

import java.util.List;

public class ProductImpl implements IProduct {
    @Override
    public void create(Product product) {
        Product product1 = product;
    }

    @Override
    public Product read(int productId) {
        return null;
    }

    @Override
    public void update(Product product, int productId) {

    }

    @Override
    public void delete(int productId) {

    }

    @Override
    public List<Product> readAll() {
        return null;
    }
}
