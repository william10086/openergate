package com.william.domain.model;

/**
 * Created by william on 17-8-3.
 */
public interface DomainEvent<T> {

    boolean sameEventAs(T other);

}
