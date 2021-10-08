package io.patterns.chain;

public class Email {
    private final EmailType type;
    private final String message;

    public Email(EmailType type, String message) {
        this.type = type;
        this.message = message;
    }

    public EmailType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
