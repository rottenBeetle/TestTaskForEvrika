package com.rottenbeetle.testtaskforevrikabi.utils;

import com.sun.jna.platform.win32.Netapi32Util;

import java.util.ArrayList;
import java.util.List;

public class UserUtil{
    public List<String> getAllUsers(){
        Netapi32Util.User[] users = Netapi32Util.getUsers();
        List<String> userNames = new ArrayList<>();
        for (Netapi32Util.User user: users) {
            userNames.add(user.name);
        }
        return userNames;
    }
}


