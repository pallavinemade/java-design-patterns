package com.pallavi.designpatterns.decorator;

/**
 * Abstract base decorator for {@link Message} objects.
 *
 * <p>This class holds a reference to another {@code Message} and provides a
 * common superclass for concrete decorators that add behaviour to the wrapped
 * message. Subclasses should delegate to the wrapped message where appropriate
 * and add additional responsibilities.</p>
 *
 * @see Message
 */
public abstract class MessageDecorator implements Message {
    /**
     * The wrapped message instance. Concrete decorators typically delegate to
     * this instance and augment or modify behaviour.
     */
    protected Message message;

    /**
     * Creates a new decorator that wraps the given message.
     */
    protected MessageDecorator(Message message) {
        if (message == null) {
            throw new NullPointerException("message must not be null");
        }
        this.message = message;
    }
}
