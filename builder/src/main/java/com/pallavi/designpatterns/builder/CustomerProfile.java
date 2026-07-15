package com.pallavi.designpatterns.builder;

import java.util.UUID;

/**
 * Represents a customer profile with various attributes.
 * This class uses the Builder pattern to create instances of CustomerProfile.
 */
public class CustomerProfile {
    private final UUID id;
    private final String name;
    private final String email;
    private final String address;
    private final String phoneNumber;

    private CustomerProfile(Builder builder) {
        this.id = UUID.randomUUID();
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    public static class Builder {
        private String name;
        private String email;
        private String address;
        private String phoneNumber;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public CustomerProfile build() {
            return new CustomerProfile(this);
        }
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "CustomerProfile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
