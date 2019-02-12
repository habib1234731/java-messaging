package com.lambdaschool;

public interface MessageService {
    void sendMessage(String message, String address);
    String readMessage();
}
