package bab.lec.springstep.DAO.interfaces.OrderBook;

import bab.lec.springstep.model.OrderBook;

import java.util.List;

public interface IOrderBookDAO {
    public OrderBook create(OrderBook product);
    public OrderBook get(String id);
    public  OrderBook update(OrderBook client);
    public  OrderBook delete(String id);
    public List<OrderBook> getAll();
}
