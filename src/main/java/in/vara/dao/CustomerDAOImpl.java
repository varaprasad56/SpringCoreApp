package in.vara.dao;

import in.vara.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository("custDAO")
public class CustomerDAOImpl implements CustomerDAO {
    @Autowired
    private DriverManagerDataSource dataSource;

    private static final String ADD_USER = "INSERT INTO CUSTOMER values (CUSTOMER_SEQ.nextval,?,?,?,?)";
    @Override
    public int insertCustomer(Customer customer) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(ADD_USER);
        statement.setString(1,customer.getCustomerName());
        statement.setString(2,customer.getCustomerCity());
        statement.setString(3,customer.getCustomerGender());
        statement.setFloat(4,customer.getCustomerRating());
        int result = statement.executeUpdate();
        System.out.println(result);
        return result;
    }
}
