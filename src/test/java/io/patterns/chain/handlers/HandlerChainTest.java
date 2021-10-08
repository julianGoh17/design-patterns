package io.patterns.chain.handlers;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HandlerChainTest {
    @Test
    public void TestInitialization() {
        SpamHandler spamHandler = new SpamHandler(null);
        ComplaintHandler complaintHandler = new ComplaintHandler(null);
        FanHandler fanHandler = new FanHandler(null);
        CatchAllHandler catchAllHandler = new CatchAllHandler();
        HandlerChain chain = new HandlerChain(spamHandler, fanHandler, complaintHandler, catchAllHandler);

        Assert.assertEquals(spamHandler, chain.getSpamHandler());
        Assert.assertEquals(fanHandler, chain.getFanHandler());
        Assert.assertEquals(complaintHandler, chain.getComplaintHandler());
        Assert.assertEquals(catchAllHandler, chain.getCatchAllHandler());
    }

    @Test
    public void TestCreateHandlerChain() {
        HandlerChain chain = HandlerChain.createHandlerChain();
        EmailHandlerTest.getEmailIterator().forEachRemaining(email -> chain.getSpamHandler().handle(email));
        Assert.assertEquals(1, chain.getSpamHandler().getEmails().size());
        Assert.assertEquals(1, chain.getComplaintHandler().getEmails().size());
        Assert.assertEquals(1, chain.getFanHandler().getEmails().size());
        Assert.assertEquals(1, chain.getCatchAllHandler().getEmails().size());

    }
}
