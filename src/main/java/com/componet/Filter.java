package com.componet;

/**
 * Created by william on 17-8-11.
 */
public interface Filter {

    /**
     * Execute order processing filter.
     */
    void doFilter(Event order);

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
