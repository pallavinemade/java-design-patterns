package com.pallavi.designpatterns.decorator;

import lombok.extern.log4j.Log4j2;

/**
 * Small demo application that exercises the Decorator pattern implementation
 * in this module. The demo composes a {@code LoanApplicationMessage} with
 * an {@code EncryptionDecorator} and then an {@code AuditDecorator}, then
 * logs the resulting decorated message content at INFO level.
 *
 * <p>This class is intentionally minimal — it exists to demonstrate how the
 * decorators can be composed at runtime.</p>
 */
@Log4j2
public class DecoratorDemo {

    public static void main(String[] args) {
        var decoratorMessage =
                new AuditDecorator(
                        new EncryptionDecorator(
                                new LoanApplicationMessage("SSN-1234567")
                        )
                );

        log.info("Decorated Message: {}", decoratorMessage.getContent());

    }
}
