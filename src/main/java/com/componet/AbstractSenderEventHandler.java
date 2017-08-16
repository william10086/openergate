package com.componet;

import com.componet.event.*;

/**
 * Created by william on 17-8-16.
 */
public class AbstractSenderEventHandler implements Handler {

    private SenderHandler senderHandler;

    public void onEvent(com.componet.event.Event event) {

        event.getType();


    }
}
