package com.componet.filter;

import com.componet.Event;

/**
 * Created by william on 17-8-12.
 */
public class ExpiredFilter extends AbstractFilter {

    private static final long DEFULT_TIME = 1000L;

    @Override
    public String execute(Event order) {
        if(order.isExpired()) {
            return "已超时...";
        } else {
            return order.getUniqueId();
        }
    }
}
