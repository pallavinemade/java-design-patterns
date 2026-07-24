package com.pallavi.designpatterns.decorator;

/**
 * Represents a message in the decorator pattern sample.
 * <p>
 * Implementations provide the textual content of the message. Decorators
 * wrap implementations of this interface to modify or enrich the returned
 * content without changing the original implementation.
 * </p>
 *
 * @since 1.0
 */
public interface Message {

    /**
     * Returns the textual content of this message.
     */
    String getContent();

}
