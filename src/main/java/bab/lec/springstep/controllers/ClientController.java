package bab.lec.springstep.controllers;

import bab.lec.springstep.forms.ClientForm;
import bab.lec.springstep.model.Client;
import bab.lec.springstep.services.impls.Client.ClientMongoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    ClientMongoServiceImpl clientService;

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
        Client newClient = new Client(clientForm.getId(), clientForm.getName(), clientForm.getDateOfBirth(), clientForm.getPhoneNumber(), clientForm.getEmail(), clientForm.getOrderBook());
        clientService.create(newClient);
        model.addAttribute("clients", clientService.getAll());
        return "client";
    }
}
