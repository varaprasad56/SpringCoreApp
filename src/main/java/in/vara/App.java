package in.vara;

import in.vara.models.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer cust = ctx.getBean("customer", Customer.class);
        System.out.println(cust.getCustomerGreeting());
    }
}
