package com.componet;

/**
 * Created by william on 17-8-11.
 */
public interface FilterChain {

    public void addFilter(Filter filter);

    public void doFilter();

}
