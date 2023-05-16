package in.vara.dao;

import in.vara.models.Customer;

import java.sql.SQLException;

public interface CustomerDAO {
    public int insertCustomer(Customer customer) throws SQLException;
}
