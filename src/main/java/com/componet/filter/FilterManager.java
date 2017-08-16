package com.componet.filter;

import com.componet.Event;

import java.util.UUID;

public class FilterManager {

  private final FilterChain filterChain;

  public FilterManager() {
    filterChain = new FilterChain();
  }

  public void addFilter(Filter filter) {
    filterChain.addFilter(filter);
  }

  public String filterRequest(Event order) {
    return filterChain.execute(order);
  }

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager();
        filterManager.addFilter(new ExpiredFilter());

        Event expiredEvent = new Event() {
            public String getUniqueId() {
                return UUID.randomUUID().toString().replace("-", "");
            }

            public long getExpireTime() {
                return 5000L;
            }

            public boolean isExpired() {
                return false;
            }
        };

        Event normalEvent = new Event() {
            public String getUniqueId() {
                return UUID.randomUUID().toString().replace("-", "");
            }

            public long getExpireTime() {
                return 800L;
            }

            public boolean isExpired() {
                return false;
            }
        };

        System.out.println(filterManager.filterRequest(expiredEvent));
        System.out.println(filterManager.filterRequest(normalEvent));
    }

}
