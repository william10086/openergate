package com.william.domain.model.ticket;

import com.william.domain.model.Entity;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;

/**
 * Created by william on 17-7-28.
 */
public class UsefulExpression implements Entity<UsefulExpression> {

    /**
     *  常用语
     */
    private Integer id;             //常用语ID
    private String  content;        //常用语描述
    private Date createdAt;         //创建时间
    private Date updatedAt;         //更新时间

    public Integer id() {
        return id;
    }

    public String content() {
        return content;
    }

    public Date createdAt() {
        return createdAt;
    }

    public Date updatedAt() {
        return updatedAt;
    }

    public boolean sameIdentityAs(UsefulExpression other) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsefulExpression that = (UsefulExpression) o;
        return sameIdentityAs(that);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().
                append(id).
                append(content).
                append(createdAt).
                append(updatedAt).
                toHashCode();
    }

    @Override
    public String toString() {
        return "UsefulExpression{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
