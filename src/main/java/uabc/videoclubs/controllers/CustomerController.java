package uabc.videoclubs.controllers;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import uabc.videoclubs.entities.Customer;
import uabc.videoclubs.entities.CustomerIndex;
import uabc.videoclubs.services.CustomerService;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @SuppressWarnings("unchecked")
    @RequestMapping(value = {"/customers","customers"})
    public String listarCustomers(Model model, HttpServletRequest request, HttpServletResponse response, Principal principal){
        List<CustomerIndex> customers;

        if(model.getAttribute("customers")==null){
            customers=customerService.getCustomers();
        }else{
            customers=(List<CustomerIndex>) model.getAttribute("customers");
        }
        model.addAttribute("customers", customers);
        return "views/customers";
    }
}
