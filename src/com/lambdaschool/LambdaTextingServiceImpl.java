package com.lambdaschool;

public class LambdaTextingServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String receiveAddress) {
        System.out.println(message + ": " +receiveAddress.toUpperCase());
    }

    @Override
    public String readMessage() {
        return null;
    }
}
