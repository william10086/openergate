package com.william.domain.model.havingclass;

import com.william.domain.model.ValueObject;

import java.util.Date;

/**
 * Created by william on 17-7-28.
 */
public class CustomerDevice implements ValueObject<CustomerDevice> {

    private Integer userId;
    private String netState;
    private String platformInfo;
    private String versionInfo;
    private String deviceStateInfo;
    private Date   createdAt;

    public boolean sameValueAs(CustomerDevice other) {
        return false;
    }
}
