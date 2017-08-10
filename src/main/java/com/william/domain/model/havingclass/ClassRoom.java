package com.william.domain.model.havingclass;

import com.google.common.collect.Lists;
import com.william.domain.model.Entity;

import java.util.List;

/**
 * Created by william on 17-7-28.
 */
public class ClassRoom implements Entity<ClassRoom> {

    private String classRoomId;                               //课堂唯一ID
    private String classRoomName;                             //课堂名称
    private ClassRoomState roomStatus;                        //课堂状态
    private List<CustomerDeviceState> customerDeviceStates;   //每个用户的设备信息和状态
    private List<ClassSessionMsg> sessionMsgs;                //课堂内的聊天信息

    private ClassRoom(String classRoomId, String classRoomName, CustomerDeviceState deviceState) {
        this.classRoomId = classRoomId;
        this.classRoomName = classRoomName;
        this.roomStatus = ClassRoomState.initDefault();
        this.customerDeviceStates = Lists.newLinkedList();
        this.customerDeviceStates.add(deviceState);
        this.sessionMsgs = Lists.newLinkedList();
    }

    //提供的功能一 创建教室
    public ClassRoom createNew(String classRoomId, String classRoomName, CustomerDeviceState customerDeviceState) {
        return new ClassRoom(classRoomId, classRoomName, customerDeviceState);
    }

    //提供的功能二 进入教室
    public Boolean enter(String classRoomId, CustomerDeviceState customerDeviceState) {
        customerDeviceStates.add(customerDeviceState);
        return false;
    }

    //提供的功能三 退出教室
    public Boolean quit(String classRoomId, Integer customerId) {
        return false;
    }

    //提供的功能四 发送信息到聊天室
    public List<ClassSessionMsg> send(ClassSessionMsg classSessionMsg) {
        sessionMsgs.add(classSessionMsg);
        return sessionMsgs;
    }

    public boolean sameIdentityAs(ClassRoom other) {
        return false;
    }
}
