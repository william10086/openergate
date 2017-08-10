package com.william.domain.model.havingclass;


import com.william.domain.model.Entity;

import java.util.Date;

/**
 * Created by william on 17-7-28.
 */
public class ClassSessionMsg implements Entity<ClassSessionMsg> {

    private Integer id;
    private Integer customerId;
    private String  customerName;
    private String  customerMobile;
    private String content;
    private Date sendedAt;

    public boolean sameIdentityAs(ClassSessionMsg other) {
        return false;
    }
}
