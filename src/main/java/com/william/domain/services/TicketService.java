package com.william.domain.services;


import com.william.domain.model.havingclass.ClassRoom;
import com.william.domain.model.havingclass.ClassSessionMsg;
import com.william.domain.model.ticket.Ticket;
import com.william.domain.model.ticket.UserEvaluation;

import java.util.List;

/**
 *  工单子系统
 *
 * Created by william on 17-7-28.
 */
public interface TicketService {

    /**
     *  获取各个状态的工单数  Read
     *
     * @return
     */
    List<Ticket> getStateTicketCount();

    /**
     *  获取工单分类  Read
     *
     * @return
     */
    List<Class> getQuestionCategory();

    /**
     *  根据工单ID 获取课堂详情   Read
     * @param ticketId
     * @return
     */
    ClassRoom getCustomerDeviceByTicketId(Integer ticketId);

    /**
     *  根据工单ID 获取课堂会话   Read
     * @param ticketId
     * @return
     */
    ClassSessionMsg getCustomerDeviceMsgByTicketId(Integer ticketId);

    /**
     *  获取某个工单的评价   Read
     *  @param ticketId
     * @return
     */
    UserEvaluation getCustomerEvaluationByTicketId(Integer ticketId);
}
