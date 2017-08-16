package com.componet;

/**
 * Created by william on 17-8-10.
 */
public interface Event {

    /**
     *  返回事件的唯一标识
     *
     * @return
     */
    public String getUniqueId();

    /**
     *  返回事件的超时时间(毫秒ms)
     *
     * @return
     */
    // public long getExpireTime();

    /**
     *  判断是否超时
     *
     * @return
     */
    public boolean isExpired();
}
