package com.pallavi.designpatterns.factory;

public class XmlMessage extends Message {
    @Override
    public String getContent() {
        return "<message>This is an XML message</message>";
    }
}
