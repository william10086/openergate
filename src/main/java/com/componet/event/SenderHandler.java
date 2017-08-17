package com.componet.event;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.concurrent.ExecutorService;

/**
 * Created by william on 17-8-16.
 */
public class SenderHandler implements Handler<SenderEvent> {

    private ExecutorService executorService = MoreExecutors.newDirectExecutorService();

    public void onEvent(final SenderEvent event) {
        executorService.submit(new Runnable() {
            public void run() {
                send(event);
            }
        });
    }

    protected void send(SenderEvent event) {
        
    }
}
