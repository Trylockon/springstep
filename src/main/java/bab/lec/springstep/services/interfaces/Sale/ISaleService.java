package bab.lec.springstep.services.interfaces.Sale;
import bab.lec.springstep.model.Sale;

import java.util.List;

public interface ISaleService {

    Sale create(Sale client);
    Sale get(String id);
    Sale update(Sale client);
    void delete(String id);
    List<Sale> getAll();
}
