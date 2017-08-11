package com.componet.filter;

import com.componet.Event;

public abstract class AbstractFilter implements Filter {

  private Filter next;

  public AbstractFilter() {}

  public AbstractFilter(Filter next) {
    this.next = next;
  }

  public void setNext(Filter filter) {
    this.next = filter;
  }

  public Filter getNext() {
    return next;
  }

  public Filter getLast() {
    Filter last = this;
    while (last.getNext() != null) {
      last = last.getNext();
    }
    return last;
  }

  public String execute(Event order) {
    if (getNext() != null) {
      return getNext().execute(order);
    } else {
      return "";
    }
  }
}
