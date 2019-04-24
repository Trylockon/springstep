package bab.lec.springstep.services.interfaces.OrderBook;

import bab.lec.springstep.model.OrderBook;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IOrderBookService {
        OrderBook create(OrderBook orderBook);
        OrderBook get(String id);
        OrderBook update(OrderBook orderBook);
        OrderBook delete(String id);
        List<OrderBook> getAll();
    }
