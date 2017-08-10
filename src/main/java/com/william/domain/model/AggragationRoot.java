package com.william.domain.model;

/**
 * Created by william on 17-7-28.
 */
public interface AggragationRoot<T> {

    boolean sameIdentityAs(T other);

}
