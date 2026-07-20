package com.pallavi.designpatterns.factory;

public class JsonMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
