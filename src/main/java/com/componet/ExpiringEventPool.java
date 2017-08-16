package com.componet;

import com.google.common.collect.Maps;

import java.util.concurrent.ConcurrentMap;

/**
 * Created by william on 17-8-16.
 */
public class ExpiringEventPool {

    private static final ConcurrentMap<String, Event> EXPIRING_EVENT_POOL = Maps.newConcurrentMap();

    /**
     * 异步发布事件到超时容器
     *
     * @param event
     */
    public void asyncPublish(final Event event) {
        new Thread(new Runnable() {
            public void run() {
                EXPIRING_EVENT_POOL.putIfAbsent(event.getUniqueId(), event);
            }
        }).start();
    }

    /**
     * 获取没有超时的事件
     *
     * @return
     */
    public Event take() {

        return null;
    }

    /**
     *
     * @return
     */
    public int getPoolSize() {
        return EXPIRING_EVENT_POOL.size();
    }
}
