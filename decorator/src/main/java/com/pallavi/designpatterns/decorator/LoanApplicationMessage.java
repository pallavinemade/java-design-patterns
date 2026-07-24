package com.pallavi.designpatterns.decorator;

/**
 * A simple implementation of {@link Message} that represents the content of a
 * loan application message.
 *
 * <p>This class is immutable: the message content is provided at construction
 * time and cannot be changed afterwards.</p>
 */
public class LoanApplicationMessage implements Message {
    /** The textual content of the loan application message. */
    private final String content;

    /**
     * Creates a new {@code LoanApplicationMessage} with the given content.
     */
    public LoanApplicationMessage(String content) {
        this.content = content;
    }

    /**
     * Returns the content of this message.
     */
    @Override
    public String getContent() {
        return content;
    }
}
