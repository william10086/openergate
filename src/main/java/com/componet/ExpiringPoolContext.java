package com.componet;

import com.componet.filter.FilterManager;

/**
 * Created by william on 17-8-16.
 */
public class ExpiringPoolContext {

    private final ExpiringEventPool eventPool = new ExpiringEventPool();
    private final FilterManager filterManager = new FilterManager();
    private final EventHandler eventHandler = new EventHandler();

    public ExpiringPoolContext() {
        super();
        init();
    }

    public void init() {
        new Thread(new Runnable() {
            public void run() {
                while (eventPool.getPoolSize() > 0) {
                    Event event = eventPool.take();
                    filterManager.filterRequest(event);
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                while (eventPool.getPoolSize() > 0) {
                    Event event = eventPool.take();
                    eventHandler.onEvent(event);
                }
            }
        }).start();
    }
}
