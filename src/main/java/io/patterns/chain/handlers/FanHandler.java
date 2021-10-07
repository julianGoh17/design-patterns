package io.patterns.chain.handlers;

import io.patterns.chain.EmailType;

public class FanHandler extends EmailHandler {
    public FanHandler(EmailHandler successor) {
        super(successor, EmailType.FAN);
    }
}
