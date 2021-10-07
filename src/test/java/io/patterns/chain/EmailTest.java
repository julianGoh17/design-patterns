package io.patterns.chain;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EmailTest {
    @Test
    public void TestEmailInitialization() {
        Email email = new Email(EmailType.SPAM, "Spam");
        Assert.assertEquals(EmailType.SPAM, email.getType());
        Assert.assertEquals("Spam", email.getMessage());
    }
}
