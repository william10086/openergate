package com.william.domain.model.handling;


import com.william.domain.model.DomainEvent;

/**
 * Created by william on 17-8-7.
 */
public class HandlingEvent implements DomainEvent<HandlingEvent> {


    public boolean sameEventAs(HandlingEvent other) {
        return false;
    }
}
