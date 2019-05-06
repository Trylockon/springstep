package bab.lec.springstep.controllers;

import bab.lec.springstep.forms.SaleForm;
import bab.lec.springstep.model.Product;
import bab.lec.springstep.model.Sale;
import bab.lec.springstep.services.impls.Product.ProductMongoServiceImpl;
import bab.lec.springstep.services.impls.Sale.SaleMongoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("api/sale")
public class SaleController {

    @Autowired
    SaleMongoServiceImpl saleService;
    @Autowired
    ProductMongoServiceImpl productService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String productList(Model model){
        model.addAttribute("sales", saleService.getAll());
        return "sale";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addSale(Model model){
        SaleForm saleForm = new SaleForm();

        Map<String, String> mavs = productService.getAll().stream()
                .collect(Collectors.toMap(Product::getId, Product::getName));

        model.addAttribute("mavs", mavs);
        model.addAttribute("saleForm", saleForm);
        return "addSale";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSale(Model model,
                             @ModelAttribute("saleForm") SaleForm saleForm){

        Product product = productService.get(saleForm.getProduct());

        Sale newSale = new Sale(saleForm.getId(), product,LocalDate.parse(saleForm.getDateOfSale()), LocalDate.parse(saleForm.getDateOfDelivery()), saleForm.getQuantity());
        saleService.create(newSale);
        model.addAttribute("sales", saleService.getAll());
        return "sale";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteStudent(Model model, @PathVariable("id") String id){

        saleService.delete(id);

        model.addAttribute("sales", saleService.getAll());
        return "sale";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editSale(Model model, @PathVariable("id") String id){

        Sale sale = saleService.get(id);
        Map<String, String> mavs = productService.getAll().stream()
                .collect(Collectors.toMap(Product::getId, Product::getName));


        SaleForm saleForm = new SaleForm();
        saleForm.setId(sale.getId());
        saleForm.setDateOfSale(sale.getDateOfSale().toString());
        saleForm.setDateOfDelivery(sale.getDateOfDelivery().toString());
        saleForm.setQuantity(sale.getQuantity());

        model.addAttribute("saleForm", saleForm);
        model.addAttribute("mavs", mavs);
        return "editSale";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    public String editSale(Model model,
                              @ModelAttribute("saleForm") SaleForm saleForm,
                              @PathVariable("id") String id){

        Sale sale = new Sale();
        Product product = productService.get(saleForm.getProduct());

        sale.setId(saleForm.getId());
        sale.setProduct(product);
        sale.setDateOfSale(LocalDate.parse(saleForm.getDateOfSale()));
        sale.setDateOfDelivery(LocalDate.parse(saleForm.getDateOfDelivery()));
        sale.setQuantity(saleForm.getQuantity());
        saleService.update(sale);
        model.addAttribute("saleForm", saleForm);
        model.addAttribute("sales", saleService.getAll());
        return "sale";
    }
}
//  private String Id;
//        private String product;
//        private LocalDate dateOfSale;
//        private LocalDate dateOfDelivery;
//        private int quantity;
