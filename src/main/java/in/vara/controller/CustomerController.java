package in.vara.controller;

import in.vara.models.Customer;

import java.sql.SQLException;

public interface CustomerController {

    public String processCustomer(Customer customer) throws SQLException;
}
