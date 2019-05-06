package bab.lec.springstep.controllers;

import bab.lec.springstep.forms.OrderBookForm;
import bab.lec.springstep.model.OrderBook;
import bab.lec.springstep.model.Sale;
import bab.lec.springstep.services.impls.OrderBook.OrderBookMongoServiceImpl;
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
@RequestMapping("api/orderbook")
public class OrderBookController {
    @Autowired
    OrderBookMongoServiceImpl orderBookService;

    @Autowired
    SaleMongoServiceImpl saleService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String productList(Model model){
        model.addAttribute("orderBooks", orderBookService.getAll());
        return "orderBook";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addOrderBook(Model model){
        OrderBookForm orderBookForm = new OrderBookForm();

        Map<String, String> mavs = saleService.getAll().stream()
                .collect(Collectors.toMap(Sale::getId, Sale::getId));

        model.addAttribute("mavs", mavs);
        model.addAttribute("orderBookForm", orderBookForm);
        return "addOrderBook";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSale(Model model,
                          @ModelAttribute("orderBookForm") OrderBookForm orderBookForm){

        Sale sale = saleService.get(orderBookForm.getSale());

        OrderBook newOrderBook = new OrderBook(orderBookForm.getId(), sale);
        orderBookService.create(newOrderBook);
        model.addAttribute("orderBooks", orderBookService.getAll());
        return "orderBook";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteStudent(Model model, @PathVariable("id") String id){

        orderBookService.delete(id);

        model.addAttribute("orderBooks", orderBookService.getAll());
        return "orderBook";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editOrderBook(Model model, @PathVariable("id") String id){

        OrderBook orderBook = orderBookService.get(id);
        Map<String, String> mavs = saleService.getAll().stream()
                .collect(Collectors.toMap(Sale::getId, Sale::getId));


        OrderBookForm orderBookForm = new OrderBookForm();
        orderBookForm.setId(orderBook.getId());
        orderBookForm.setSale(orderBook.getSale().toString());

        model.addAttribute("orderBookForm", orderBookForm);
        model.addAttribute("mavs", mavs);
        return "editOrderBook";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    public String editOrderBook(Model model,
                           @ModelAttribute("orderBookForm") OrderBookForm orderBookForm,
                           @PathVariable("id") String id){

       Sale sale = saleService.get(orderBookForm.getSale());

        OrderBook orderBook = new OrderBook();

        orderBook.setId(orderBookForm.getId());
        orderBook.setSale(sale);
        orderBookService.update(orderBook);
        model.addAttribute("orderBookForm", orderBookForm);
        model.addAttribute("orderBooks", orderBookService.getAll());
        return "orderBook";
    }
}

