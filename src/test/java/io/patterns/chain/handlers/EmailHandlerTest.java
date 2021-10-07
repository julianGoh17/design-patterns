package io.patterns.chain.handlers;

import io.patterns.chain.Email;
import io.patterns.chain.EmailType;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;

public class EmailHandlerTest {
    private static final Email SPAM_EMAIL = new Email(EmailType.SPAM, "Spam");
    private static final Email FAN_EMAIL = new Email(EmailType.FAN, "Fan");
    private static final Email COMPLAINT_EMAIL = new Email(EmailType.COMPLAINT, "Complaint");
    private static final Email OTHER_EMAIL = new Email(EmailType.OTHER, "Other");

    @Test
    public void TestAbstractEmailHandler() {
        EmailHandler handler = new CatchAllHandler();
        Assert.assertEquals(0, handler.getEmails().size());
        handler.addEmail(OTHER_EMAIL);
        Assert.assertEquals(1, handler.getEmails().size());
        Assert.assertEquals(OTHER_EMAIL, handler.getEmails().get(0));
    }

    @Test
    public void TestCatchAllHandler() {
        EmailHandler handler = new CatchAllHandler();
        getEmailIterator().forEachRemaining(handler::handle);
        Assert.assertEquals(1, handler.getEmails().size());
    }

    @Test
    public void TestComplaintHandlerHandlesMessages() {
        EmailHandler catchAllHandler = new CatchAllHandler();
        EmailHandler handler = new ComplaintHandler(catchAllHandler);
        AssertHandlerCorrectlyHandlesEmail(handler, catchAllHandler);
    }

    @Test
    public void TestFanHandlerHandlesMessages() {
        EmailHandler catchAllHandler = new CatchAllHandler();
        EmailHandler handler = new FanHandler(catchAllHandler);
        AssertHandlerCorrectlyHandlesEmail(handler, catchAllHandler);
    }

    @Test
    public void TestSpamHandlerHandlesMessages() {
        EmailHandler catchAllHandler = new CatchAllHandler();
        EmailHandler handler = new SpamHandler(catchAllHandler);
        AssertHandlerCorrectlyHandlesEmail(handler, catchAllHandler);
    }

    private void AssertHandlerCorrectlyHandlesEmail(EmailHandler handler, EmailHandler successor) {
        getEmailIterator().forEachRemaining(handler::handle);
        Assert.assertEquals(1, handler.getEmails().size());
        Assert.assertEquals(1, successor.getEmails().size());
    }

    public static Iterator<Email> getEmailIterator() {
        return Arrays.asList(SPAM_EMAIL, FAN_EMAIL, COMPLAINT_EMAIL, OTHER_EMAIL).iterator();
    }
}
