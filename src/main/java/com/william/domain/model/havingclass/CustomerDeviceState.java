package com.william.domain.model.havingclass;


import com.william.domain.model.ValueObject;

/**
 * Created by william on 17-7-28.
 */
public class CustomerDeviceState implements ValueObject<CustomerDeviceState> {

    private Integer customerId;                 //用户ID标识
    private String  customerName;               //用户名
    private String  customerMobile;             //用户手机号
    private CustomerDevice customerDevice;      //用户设备
    private DeviceStatus deviceStatus;          //0-在线正常 1-在线异常

    public boolean sameValueAs(CustomerDeviceState other) {
        return false;
    }

    enum DeviceStatus {
        NORMAL(0),
        ABNORMAL(1);

        int value;

        DeviceStatus(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
