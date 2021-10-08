package io.patterns.chain.handlers;

import io.patterns.chain.Email;
import io.patterns.chain.EmailType;

import java.util.ArrayList;
import java.util.List;

public abstract class EmailHandler {
    protected final EmailHandler successor;
    protected final List<Email> emails;
    private final EmailType targetedEmailType;

    public EmailHandler(EmailHandler successor, EmailType targetedEmailType) {
        this.successor = successor;
        this.emails = new ArrayList<>();
        this.targetedEmailType = targetedEmailType;
    }

    public void handle(Email email) {
        if (targetedEmailType.equals(email.getType())) {
            addEmail(email);
        } else {
            passOnToSuccessor(email);
        }
    }

    private void passOnToSuccessor(Email email) {
        if (successor != null) {
            successor.handle(email);
        }
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void addEmail(Email email) {
        this.emails.add(email);
    }
}
