package io.patterns.chain.handlers;

import io.patterns.chain.EmailType;

public class CatchAllHandler extends EmailHandler {
    public CatchAllHandler() {
        super(null, EmailType.OTHER);
    }
}
