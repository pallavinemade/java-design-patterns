package com.pallavi.designpatterns.decorator;

import lombok.extern.log4j.Log4j2;

/**
 * AuditDecorator is a concrete decorator that adds auditing functionality to messages.
 * It logs the content of messages while delegating the actual message content retrieval
 * to the wrapped Message object.
 *
 * <p>This class follows the Decorator design pattern to dynamically add auditing behavior
 * to Message objects without modifying their original implementation.</p>
 */
@Log4j2
public class AuditDecorator extends MessageDecorator {

    /**
     * Constructs an AuditDecorator with the specified message.
     */
    public AuditDecorator(Message message) {
        super(message);
    }

    /**
     * Returns the content of the wrapped message after logging it for audit purposes.
     */
    @Override
    public String getContent() {
        // Add auditing logic here
        log.info("Auditing message: {}", message.getContent());
        return message.getContent();
    }
}
