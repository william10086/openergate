package com.componet;

import com.componet.event.SenderEvent;
import com.componet.event.SenderHandler;
import com.componet.filter.FilterManager;
import org.hsqldb.rights.User;

import java.util.Iterator;
import java.util.List;

/**
 * Created by william on 17-8-16.
 */
public class SMSSenderHandler extends SenderHandler {

    private SMSSenderUtil senderUtil;
    private UserContainer userContainer;
    private FilterManager filterManager;

    @Override
    public void send(SenderEvent event) {
        List<User> userList = userContainer.getAvailableUsers();
        Iterator<User> userIterator = userList.iterator();
        while (userIterator.hasNext()) {
            senderUtil.send(userIterator.next(), event.getMessage());
        }
    }
}
