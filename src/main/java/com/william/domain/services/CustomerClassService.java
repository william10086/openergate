package com.william.domain.services;


import com.william.domain.model.havingclass.ClassRoom;

import java.util.List;

/**
 *  用户子系统
 *
 * Created by william on 17-7-28.
 */
public interface CustomerClassService {

    /**
     *  获取有异常设备的课程列表    Read
     *
     * @return
     */
    public List<ClassRoom> getAbonomalDeviceClasses();

    /**
     *  获取所有异常设备的课程列表   Read
     *
     * @return
     */
    public List<ClassRoom> getAllDeviceClasses();

    /**
     *  在所有设备中按用户名称搜索课堂     Read
     *  @param customerName
     * @return
     */
    public List<ClassRoom> searchDeviceClasses(String customerName);

    /**
     *  根据clsUid获取莫个课堂内的相关信息    Read
     * @param clsUid
     * @return
     */
    public ClassRoom getCustomerClass(String clsUid);

    /**
     *  重置含有异常设备的课程     Write
     * @param clsUid
     */
    public void resetAbnormalDeviceClass(String clsUid);
}
