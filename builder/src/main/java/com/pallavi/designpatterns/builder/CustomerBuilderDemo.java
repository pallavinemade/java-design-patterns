package com.pallavi.designpatterns.builder;


import lombok.extern.log4j.Log4j2;

/**
 * This class demonstrates the usage of the Builder pattern to create a CustomerProfile object.
 * It creates a CustomerProfile instance using the Builder and prints its details.
 */
@Log4j2
public class CustomerBuilderDemo {
     public static void main(String[] args) {
        CustomerProfile customer = new CustomerProfile.Builder()
                .name("Pallavi Nemade")
                .email("pallavi.nemade@example.com")
                .address("123 Main St")
                .phoneNumber("555-1234")
                .build();
         log.info("Customer: {}", customer);

         CustomerEmail customerEmail = CustomerEmail.builder()
                 .toAddress(customer.getEmail())
                 .subject("Welcome " + customer.getName())
                 .body("Dear " + customer.getName() + ",\n\nThank you for registering with us!\n\nBest regards,\nThe Team")
                 .build();
           log.info("Customer Email: {}", customerEmail);
    }
}
