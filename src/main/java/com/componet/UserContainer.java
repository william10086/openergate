package com.componet;

import org.hsqldb.rights.User;

import java.util.List;

/**
 * Created by william on 17-8-16.
 */
public class UserContainer {
    private List<User> availableUsers;

    public List<User> getAvailableUsers() {
        return availableUsers;
    }
}
