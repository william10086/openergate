package com.william.domain.model.ticket;

import com.william.domain.model.ValueObject;

/**
 * Created by william on 17-8-7.
 */
public class TicketCategory implements ValueObject<TicketCategory> {

    private Integer categoryId;
    private String categoryName;
    private String categoryDesc;

    public boolean sameValueAs(TicketCategory other) {
        return false;
    }
}
