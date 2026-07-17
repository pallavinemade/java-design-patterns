package com.pallavi.designpatterns.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CustomerEmail {
    private final String toAddress;
    private final String subject;
    private final String body;
    @Builder.Default
    private final String fromAddress = "abc@example.com";

    @Override
    public String toString() {
        return "CustomerEmail{" +
                "toAddress='" + toAddress + '\'' +
                ", fromAddress='" + fromAddress + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
