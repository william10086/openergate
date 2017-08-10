package com.william.domain.model.ticket;

import com.william.domain.model.Entity;

/**
 *  工作助手
 *
 * Created by william on 17-7-29.
 */
public class WorkAssist implements Entity<WorkAssist> {

    private UsefulExpression usefulExpression;

    public WorkAssist(UsefulExpression usefulExpression) {
    }

    public static WorkAssist createWorkAssist(UsefulExpression usefulExpression) {
        if(usefulExpression == null) {
//            Assert.isNull(usefulExpression);
        }
        return new WorkAssist(usefulExpression);
    }

    public UsefulExpression save(UsefulExpression usefulExpression) {
        return null;
    }

    public UsefulExpression edit(UsefulExpression usefulExpression) {
        return null;
    }

    public Integer delete(Integer usefulExpressionId) {
        return null;
    }

    public boolean sameIdentityAs(WorkAssist other) {
        return false;
    }
}
