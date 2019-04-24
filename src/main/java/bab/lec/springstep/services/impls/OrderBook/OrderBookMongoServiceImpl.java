package bab.lec.springstep.services.impls.OrderBook;

import bab.lec.springstep.model.OrderBook;
import bab.lec.springstep.repository.OrderBookRepository;
import bab.lec.springstep.services.interfaces.OrderBook.IOrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderBookMongoServiceImpl implements IOrderBookService {
    @Autowired
    OrderBookRepository repository;

    @Override
    public OrderBook create(OrderBook orderBook) {
        return this.repository.save(orderBook);
    }

    @Override
    public OrderBook get(String id) {

        return this.repository.findById(id).orElse(null);
    }

    @Override
    public OrderBook update(OrderBook orderBook) {
        return this.repository.save(orderBook);
    }

    @Override
    public OrderBook delete(String id) {
        return this.delete(id);
    }

    @Override
    public List<OrderBook> getAll() {
        return this.repository.findAll();
    }
}
