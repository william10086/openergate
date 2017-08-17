package com.componet;

import com.google.common.collect.Lists;
import org.hsqldb.rights.User;

import java.util.List;
import java.util.SortedMap;

/**
 * Created by william on 17-8-16.
 */
public class UserContainer {
    private SortedMap<User, Long> availableUsers = null;

    public List<User> getAvailableUsers() {
        return Lists.newArrayList(availableUsers.keySet());
    }

    public User popAvailableUser() {
        return null;
    }
}
