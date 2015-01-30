package com.japharr.guestbook.config.model;

/**
 * Created by Japharr on 28/1/2015.
 */
public interface UserRegistry {
    GaeUser findUser(String userId);
    void registerUser(GaeUser newUser);
    void removeUser(String userId);
}
