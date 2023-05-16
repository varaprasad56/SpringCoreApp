package in.vara.service;

import in.vara.dao.CustomerDAO;
import in.vara.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service("custService")
public class CustomerManagementServiceImpl implements CustomerManagementService{

    @Autowired
    private CustomerDAO customerDAO;
    @Override
    public String registerCustomer(Customer customer) throws SQLException {
        int res = customerDAO.insertCustomer(customer);
        return String.valueOf(res);
    }
}
