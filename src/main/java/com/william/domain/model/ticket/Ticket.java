package com.william.domain.model.ticket;

import com.william.domain.model.Entity;

import java.util.Date;

/**
 * Created by william on 17-7-28.
 */
public class Ticket implements Entity<Ticket> {
    private Integer id;                 // 工单（问题）ID
    private TicketCategory category;    // 工单所属分类ID
    private String subject;             // 工单（问题）标题或名称
    private String describe;            // 工单（问题）内容描述，包涵上传的图片(富文本)
    private TicketStatus status;        // 工单（问题）所属状态信息：1-处理中，2-转开发，3-已解决，待确认，4-已确认
    private TicketChannel channel;      // 工单（问题）渠道来源：1-在线聊天，2-邮件，3-qq或威信等第三方渠道
    private Date createdAt;             // 问题创建时间
    private Date updatedAt;             // 最近更新时间

    public boolean sameIdentityAs(Ticket other) {
        return false;
    }

    enum TicketStatus {
        /**
         *  待处理
         */
        ABNORMAL(1),
        /**
         *  转开发
         */
        PROCESSING(2),
        /**
         *  已解决，待确认
         */
        SOLVED(3),
        /**
         *  已经确认
         */
        CONFIRMED(4);

        int value;

        TicketStatus(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum TicketChannel {
        ONLINE(1),
        EMAIL(2),
        QQ(3),
        WECHAT(4);

        int value;

        TicketChannel(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
