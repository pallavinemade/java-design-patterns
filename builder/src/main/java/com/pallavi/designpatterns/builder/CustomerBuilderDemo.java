package com.pallavi.designpatterns.builder;


/**
 * This class demonstrates the usage of the Builder pattern to create a CustomerProfile object.
 * It creates a CustomerProfile instance using the Builder and prints its details.
 */
public class CustomerBuilderDemo {
     static void main(String[] args) {
        CustomerProfile customer = new CustomerProfile.Builder()
                .name("Pallavi Nemade")
                .email("pallavi.nemade@example.com")
                .address("123 Main St")
                .phoneNumber("555-1234")
                .build();
        System.out.println("Customer: " + customer);
    }
}
