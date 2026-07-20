package com.pallavi.designpatterns.factory;

public class XmlMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new XmlMessage();
    }
}
