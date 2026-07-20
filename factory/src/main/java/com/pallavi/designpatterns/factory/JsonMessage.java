package com.pallavi.designpatterns.factory;

public class JsonMessage extends Message {
    @Override
    public String getContent() {
        return "{ \"message\": \"This is a JSON message\" }";
    }
}
