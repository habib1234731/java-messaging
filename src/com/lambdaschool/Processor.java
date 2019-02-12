package com.lambdaschool;

public interface Processor {
    void sendMessage(String msg, String address);
    String readMessage();
}
