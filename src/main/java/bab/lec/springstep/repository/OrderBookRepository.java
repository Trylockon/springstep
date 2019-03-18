package bab.lec.springstep.repository;

import bab.lec.springstep.model.OrderBook;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderBookRepository extends MongoRepository<OrderBook,String> {
}
