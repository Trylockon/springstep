package bab.lec.springstep.services.impls.Sale;

import bab.lec.springstep.model.Sale;
import bab.lec.springstep.repository.SaleRepository;
import bab.lec.springstep.services.interfaces.Sale.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleMongoServiceImpl implements ISaleService {
    @Autowired
    SaleRepository repository;

    @Override
    public Sale create(Sale sale) {
        return this.repository.save(sale);
    }

    @Override
    public Sale get(String id) {

        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Sale update(Sale sale) {
        return this.repository.save(sale);
    }

    @Override
    public Sale delete(String id) {
        return this.delete(id);
    }

    @Override
    public List<Sale> getAll() {
        return this.repository.findAll();
    }
}
