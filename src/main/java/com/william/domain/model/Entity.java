package com.william.domain.model;

/**
 * Created by william on 17-7-29.
 */
public interface Entity<T> {

    boolean sameIdentityAs(T other);

}
