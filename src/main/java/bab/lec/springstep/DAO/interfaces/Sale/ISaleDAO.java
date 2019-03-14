package bab.lec.springstep.DAO.interfaces.Sale;

import bab.lec.springstep.model.Sale;

import java.util.List;

public interface ISaleDAO {
    public Sale create(Sale product);
    public Sale get(String id);
    public  Sale update(Sale client);
    public Sale delete(String id);
    public List<Sale> getAll();
}
