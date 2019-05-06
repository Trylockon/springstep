package bab.lec.springstep.controllers;

import bab.lec.springstep.forms.ClientForm;
import bab.lec.springstep.model.Client;
import bab.lec.springstep.model.OrderBook;
import bab.lec.springstep.services.impls.Client.ClientMongoServiceImpl;
import bab.lec.springstep.services.impls.OrderBook.OrderBookMongoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    ClientMongoServiceImpl clientService;

    @Autowired
    OrderBookMongoServiceImpl orderBookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String clientList(Model model){
        model.addAttribute("clients", clientService.getAll());
        return "client";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addClient(Model model){
        ClientForm clientForm = new ClientForm();
        model.addAttribute("clientForm", clientForm);
        return "addClient";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addStudent(Model model, @ModelAttribute("clientForm") ClientForm clientForm){
        Client newClient = new Client(clientForm.getId(), clientForm.getName(), LocalDate.parse(clientForm.getDateOfBirth()), clientForm.getPhoneNumber(), clientForm.getEmail());
        clientService.create(newClient);
        model.addAttribute("clients", clientService.getAll());
        return "client";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteClient(Model model, @PathVariable("id") String id){

        clientService.delete(id);

        model.addAttribute("clients", clientService.getAll());
        return "client";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editClient(Model model, @PathVariable("id") String id){

        Client client = clientService.get(id);

        Map<String, String> mavs = orderBookService.getAll().stream()
                .collect(Collectors.toMap(OrderBook::getId, OrderBook::getId));

        ClientForm clientForm = new ClientForm();
        clientForm.setId(client.getId());
        clientForm.setName(client.getName());
        clientForm.setDateOfBirth((client.getDateOfBirth().toString()));
        clientForm.setEmail(client.getEmail());
        clientForm.setPhoneNumber(client.getPhoneNumber());
        clientForm.setOrderBook(client.getOrderBook().toString());


        model.addAttribute("clientForm", clientForm);
        model.addAttribute("mavs", mavs);
        return "editClient";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    public String editSale(Model model,
                           @ModelAttribute("clientForm") ClientForm clientForm,
                           @PathVariable("id") String id){

        Client client = new Client();
        OrderBook orderBook = orderBookService.get(clientForm.getOrderBook());

        client.setId(clientForm.getId());
        client.setName(clientForm.getName());
        client.setDateOfBirth(LocalDate.parse(clientForm.getDateOfBirth().toString()));
        client.setEmail(clientForm.getEmail());
        client.setPhoneNumber(clientForm.getPhoneNumber());
        client.setOrderBook(orderBook);
        clientService.update(client);
        model.addAttribute("clientForm", clientForm);
        model.addAttribute("clients", clientService.getAll());
        return "client";
    }
}
