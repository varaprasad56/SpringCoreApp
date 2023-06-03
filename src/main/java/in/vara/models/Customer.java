package in.vara.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("customer")
@PropertySource("app.properties")
public class Customer {
    private String customerName;
    private String customerCity;
    private String customerGender;
    private Double customerRating;
    private String customerGreeting;

    @Autowired
    private LocalDateTime ldt;

    public String getCustomerGreeting() {
        if(ldt.getHour()<12){
            return "Happy First Hour";
        }else {
            return "Happy Second Hour";
        }
    }

    public void setCustomerGreeting(String customerGreeting) {

        this.customerGreeting = customerGreeting;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public Double getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(Double customerRating) {
        this.customerRating = customerRating;
    }
}
