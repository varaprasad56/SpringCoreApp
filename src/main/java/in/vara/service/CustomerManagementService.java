package in.vara.service;

import in.vara.models.Customer;

import java.sql.SQLException;

public interface CustomerManagementService {
    public String registerCustomer(Customer customer) throws SQLException;
}
