package bab.lec.springstep.repository;

import bab.lec.springstep.model.Sale;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends MongoRepository<Sale,String> {
}
