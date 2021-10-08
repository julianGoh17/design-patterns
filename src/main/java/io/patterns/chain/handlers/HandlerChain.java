package io.patterns.chain.handlers;

public class HandlerChain {
    private final SpamHandler spamHandler;
    private final FanHandler fanHandler;
    private final ComplaintHandler complaintHandler;
    private final CatchAllHandler catchAllHandler;

    public HandlerChain(SpamHandler spamHandler, FanHandler fanHandler, ComplaintHandler complaintHandler, CatchAllHandler catchAllHandler) {
        this.spamHandler = spamHandler;
        this.complaintHandler = complaintHandler;
        this.fanHandler = fanHandler;
        this.catchAllHandler = catchAllHandler;
    }

    public static HandlerChain createHandlerChain() {
        CatchAllHandler catchAllHandler = new CatchAllHandler();
        ComplaintHandler complaintHandler = new ComplaintHandler(catchAllHandler);
        FanHandler fanHandler = new FanHandler(complaintHandler);
        SpamHandler spamHandler = new SpamHandler(fanHandler);
        return new HandlerChain(spamHandler, fanHandler, complaintHandler, catchAllHandler);
    }

    public SpamHandler getSpamHandler() {
        return spamHandler;
    }

    public ComplaintHandler getComplaintHandler() {
        return complaintHandler;
    }

    public FanHandler getFanHandler() {
        return fanHandler;
    }

    public CatchAllHandler getCatchAllHandler() {
        return catchAllHandler;
    }
}
