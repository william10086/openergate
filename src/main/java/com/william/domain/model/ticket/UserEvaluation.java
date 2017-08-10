package com.william.domain.model.ticket;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zdpwilliam on 17-2-23.
 */
public class UserEvaluation implements Serializable {

    private Integer id;
    private String lessonUid;       //会话ID
    private String mobile;          //用户手机号
    private Integer starLevel;      //评星级别:1-5
    private Integer techSupport;    //技术支持评价：1-已解决 2-未解决 3-时好时坏 4-误报没异常
    private String evaluateContent; //评论内容
    private Date evaluateTime;      //评论时间

    public UserEvaluation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLessonUid() {
        return lessonUid;
    }

    public void setLessonUid(String lessonUid) {
        this.lessonUid = lessonUid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }

    public Integer getTechSupport() {
        return techSupport;
    }

    public void setTechSupport(Integer techSupport) {
        this.techSupport = techSupport;
    }

    public String getEvaluateContent() {
        return evaluateContent;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    @Override
    public String toString() {
        return "UserEvaluation{" +
                "id=" + id +
                ", lessonUid='" + lessonUid + '\'' +
                ", mobile='" + mobile + '\'' +
                ", starLevel=" + starLevel +
                ", techSupport=" + techSupport +
                ", evaluateContent='" + evaluateContent + '\'' +
                ", evaluateTime=" + evaluateTime +
                '}';
    }
}
