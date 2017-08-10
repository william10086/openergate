package com.william.domain.services;

import com.william.domain.model.ticket.Agent;

import java.util.List;

/**
 *  员工子系统
 *
 * Created by william on 17-7-28.
 */
public interface EmployeeService {

    /**
     * 获取所有的客服人员     Read
     *
     * @return
     */
    List<Agent> getAllAgent();
}
