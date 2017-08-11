package com.componet.filter;

import com.componet.Event;

public interface Filter {

  String execute(Event event);

  void setNext(Filter filter);

  Filter getNext();

  Filter getLast();
}
