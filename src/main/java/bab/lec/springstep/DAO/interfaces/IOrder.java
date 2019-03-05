package bab.lec.springstep.DAO.interfaces;

import bab.lec.springstep.model.Order;

import java.util.List;

public interface IOrder {
    void create(Order order);
    Order read(int orderId);
    void update(Order order, int orderId);
    void delete(int orderId);
    List<Order> readAll();
}
