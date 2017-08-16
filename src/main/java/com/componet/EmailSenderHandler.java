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
public class EmailSenderHandler extends SenderHandler {

    private EmailSenderUtil senderUtil;
    private UserContainer userContainer;
    private FilterManager filterManager;

    @Override
    public void onEvent(SenderEvent event) {
        List<User> userList = userContainer.getAvailableUsers();
        Iterator<User> userIterator = userList.iterator();
        while (userIterator.hasNext()) {
            filterManager.filterRequest(new Event() {
                public String getUniqueId() {
                    return null;
                }

                public boolean isExpired() {
                    return false;
                }
            });
            senderUtil.send(userIterator.next(), event.getMessage());
        }
    }
}
