package com.william.domain.model.customer;

import com.william.domain.model.Entity;
import com.william.domain.model.ticket.Ticket;

/**
 * Created by william on 17-7-28.
 */
public class Customer implements Entity<Customer> {

    private Integer id;
    private String  username;
    private String  mobile;
    private String  role;
    private String  contact;

    /**
     *  职责 1： 申请工单  Write
     *
     * @param ticket
     * @return
     */
    public Ticket applyTicket(Ticket ticket) {

        return null;
    }

    /**
     *  职责 2： 确认工单  Write
     *
     * @param ticket
     * @return
     */
    public Integer comfirmTicket(Ticket ticket) {

        return null;
    }

    /**
     *  职责 3： 评价工单  Write
     *
     * @param ticket
     * @return
     */
    public Integer evaluateTicket(Ticket ticket) {

        return null;
    }

    public boolean sameIdentityAs(Customer other) {
        return false;
    }
}
