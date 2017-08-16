package com.componet.filter;

import com.componet.Event;

public class FilterChain {

    private Filter chain;

    /**
     * Adds filter
     */
    public void addFilter(Filter filter) {
        if (chain == null) {
            chain = filter;
        } else {
            chain.getLast().setNext(filter);
        }
    }

    /**
     * Execute filter chain
     */
    public String execute(Event order) {
        if (chain != null) {
            return chain.execute(order);
        } else {
            return "RUNNING...";
        }
    }
}