package in.vara.controller;

import in.vara.models.Customer;
import in.vara.service.CustomerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.SQLException;

@Controller("custController")
public class CustomerControllerImpl implements CustomerController {

    @Autowired
    private CustomerManagementService customerManagementService;

    @Override
    public String processCustomer(Customer customer) throws SQLException {
       return  customerManagementService.registerCustomer(customer);
    }
}
