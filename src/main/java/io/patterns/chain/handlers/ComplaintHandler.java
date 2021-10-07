package io.patterns.chain.handlers;

import io.patterns.chain.EmailType;

public class ComplaintHandler extends EmailHandler {
    public ComplaintHandler(EmailHandler successor) {
        super(successor, EmailType.COMPLAINT);
    }
}
