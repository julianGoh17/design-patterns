package io.patterns.chain.handlers;

import io.patterns.chain.EmailType;

public class SpamHandler extends EmailHandler {
    public SpamHandler(EmailHandler successor) {
        super(successor, EmailType.SPAM);
    }
}
