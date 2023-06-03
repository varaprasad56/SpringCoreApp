package in.vara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Customer cust = ctx.getBean("customer", Customer.class);
//        System.out.println(cust.getCustomerGreeting());
        Locale hiInLocale = new Locale("hi", "in");
        System.out.println(ctx.getMessage("customer.message", new String[]{}, hiInLocale));
    }
}
