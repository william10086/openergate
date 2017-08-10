package com.william.domain.model.ticket;


import com.william.domain.model.Entity;

/**
 * Created by william on 17-7-28.
 */
public class Agent implements Entity<Agent> {

    /**
     *  依赖对象
     */
    private Ticket ticket;
    private UsefulExpression usefulExpression;

    /**
     *  职责 1： 接收工单  Write
     *
     * @param ticket
     * @return
     */
    public Ticket holdTicket(Ticket ticket) {

        return null;
    }

    /**
     *  职责 2： 解决工单  Write
     *
     * @param ticket
     * @return
     */
    public Integer solveTicket(Ticket ticket) {

        return null;
    }

    /**
     *  职责 3： 将工单转给开发人员 Write
     *
     * @param ticket
     * @return
     */
    public Integer turnTicketToDevloper(Ticket ticket) {

        return null;
    }

    /**
     *  职责 4： 备注工单  Write
     *
     * @param ticket
     * @return
     */
    public Integer remarkTicket(Ticket ticket) {

        return null;
    }

    /**
     *  职责 5： 回复工单  Write
     *
     * @param ticket
     * @return
     */
    public Integer replyTicket(Ticket ticket) {

        return null;
    }

    /**
     *  知识库
     *  常用语相关 也就是右键快捷编辑功能
     */
    /**
     *  职责 6： 添加常用语 Write
     *
     * @param usefulExpression
     * @return
     */
    public UsefulExpression save(UsefulExpression usefulExpression) {
//        return usefulExpression.save(usefulExpression);
        return null;
    }

    /**
     *  职责 7： 编辑常用语
     *
     * @param usefulExpression  Write
     * @return
     */
    public UsefulExpression edit(UsefulExpression usefulExpression) {
//        return usefulExpression.edit(usefulExpression);
        return null;
    }

    /**
     *  职责 8： 删除常用语
     *
     * @param usefulExpressionId    Write
     * @return
     */
    public Integer delete(Integer usefulExpressionId) {
//        return usefulExpression.delete(usefulExpressionId);
        return null;
    }

    public boolean sameIdentityAs(Agent other) {
        return false;
    }
}
