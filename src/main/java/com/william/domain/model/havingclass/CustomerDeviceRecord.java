package com.william.domain.model.havingclass;

import com.william.domain.model.Entity;
import com.william.domain.model.customer.Customer;

import java.util.Date;

/**
 * Created by william on 17-8-3.
 */
public class CustomerDeviceRecord implements Entity<CustomerDeviceRecord> {

    private Integer id;                     //记录ID
    private Integer ticketId;               //关联的工单ID
    private Customer customer;              //用户基本信息
    private CustomerDevice customerDevice;  //当时的用户设备信息
    private Date createdAt;                 //创建日期

    public boolean sameIdentityAs(CustomerDeviceRecord other) {
        return false;
    }
}
