package com.pallavi.designpatterns.decorator;

/**
 * Concrete decorator that adds encryption functionality
 * to a Message. It wraps a Message object and encrypts its content using a simple
 * reversal algorithm. This decorator implements the Decorator pattern to provide
 * optional encryption functionality without modifying the original Message class.
 */
public class EncryptionDecorator extends MessageDecorator {

    /**
     * Constructs an EncryptionDecorator with the specified message.
     */
    public EncryptionDecorator(Message message) {
        super(message);
    }

    /**
     * Returns the encrypted content of the wrapped message.
     * The original message content is retrieved and then encrypted using
     * the encrypt method.
     */
    @Override
    public String getContent() {
        String content = message.getContent();
        return encrypt(content);
    }

    /**
     * Encrypts the given content using a simple string reversal algorithm.
     * This is a basic encryption implementation for demonstration purposes only
     * and should not be used for production security-sensitive applications.
     */
    private String encrypt(String content) {
        // Simple encryption logic (for demonstration purposes)
        return new StringBuilder(content).reverse().toString();
    }
}
