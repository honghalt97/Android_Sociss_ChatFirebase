package com.example.my_pc.chatfirebase;

/**
 * Class responsible to register all the callbacks necessary
 * for the application
 */
public interface ActivityCallback {
    void openChat();
    void openCreateAccount();
    void logout();
}