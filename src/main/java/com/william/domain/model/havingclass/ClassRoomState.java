package com.william.domain.model.havingclass;

import com.william.domain.model.ValueObject;

import java.util.Date;

/**
 * Created by william on 17-8-3.
 */
public class ClassRoomState implements ValueObject<ClassRoomState> {

    private RoomStatus runningStatus;   //0-在线正常 1-在线异常 2-处理中
    private Date    outageTime;         //异常出现时间
    private Long    remainderDuration;  //距离报警剩余时长(毫秒)
    private Date    startTime;          //课程开始时间
    private Long    classDuration;      //课程时长（毫秒）

    private ClassRoomState(RoomStatus runningStatus, Date outageTime, Long remainderDuration, Date startTime, Long classDuration) {
        this.runningStatus = runningStatus;
        this.outageTime = outageTime;
        this.remainderDuration = remainderDuration;
        this.startTime = startTime;
        this.classDuration = classDuration;
    }

    public boolean sameValueAs(ClassRoomState other) {
        return false;
    }

    /**
     *  初始化教室状态
     * @return
     */
    public static ClassRoomState initDefault() {
        return new ClassRoomState(RoomStatus.NORMAL, null, null, new Date(), null);
    }

    enum RoomStatus {
        NORMAL(0),
        ABNORMAL(1),
        PROCESSING(0);

        int value;

        RoomStatus(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
