package com.componet.filter;

import com.componet.Event;

public interface Filter {

    /**
     * Execute order processing filter.
     */
    String execute(Event event);

    /**
     * Set next filter in chain after this.
     */
    void setNext(Filter filter);

    /**
     * Get next filter in chain after this.
     */
    Filter getNext();

    /**
     * Get last filter in the chain.
     */
    Filter getLast();
}