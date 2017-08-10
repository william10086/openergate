package com.william.domain.services;

import com.william.domain.model.ticket.UsefulExpression;

import java.util.List;

/**
 *  知识库子系统
 *
 * Created by william on 17-7-28.
 */
public interface KnowledgeService {

    /**
     *  获取所有的常用语    Read
     * @return
     */
    List<UsefulExpression> getAllUsefulExpression();

}
