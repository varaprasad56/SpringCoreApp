package in.vara;

import in.vara.controller.CustomerController;
import in.vara.models.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer = new Customer();
        customer.setCustomerCity("Banglore");
        customer.setCustomerGender("F");
        customer.setCustomerName("vasu");;
        customer.setCustomerRating(4.5F);
        CustomerController customerController = ctx.getBean("custController",CustomerController.class);
        System.out.println(customerController.processCustomer(customer));
        Customer cust = ctx.getBean("customer", Customer.class);
        System.out.println(cust.getCustomerGreeting());
    }
}
