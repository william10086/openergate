package com.componet.event;

/**
 * Created by william on 17-8-16.
 */
public abstract class SenderEvent implements Event {

    protected SenderEventType eventType;
    private String message;

    private SenderEvent(SenderEventType eventType) {
        this.eventType = eventType;
    }

    protected abstract SenderEvent create(SenderEventType eventType);

    protected abstract String getMessageContent();

    public Class<? extends Event> getType() {
        return null;
    }

    public String getMessage() {
        return message;
    }

    static enum SenderEventType {
        EMAIL,
        SMS
    }
}
