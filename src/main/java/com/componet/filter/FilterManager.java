package com.componet.filter;

import com.componet.Event;

public class FilterManager {

  private FilterChain filterChain;

  public FilterManager() {
    filterChain = new FilterChain();
  }

  public void addFilter(Filter filter) {
    filterChain.addFilter(filter);
  }

  public String filterRequest(Event order) {
    return filterChain.execute(order);
  }
}
