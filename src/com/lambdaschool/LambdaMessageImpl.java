package com.lambdaschool;

public class LambdaMessageImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String receiveAddress) {
        System.out.println("*** FOR " + receiveAddress + ": " + msg);
    }

    @Override
    public String readMessage() {
        return "Not Implemented";
    }
}
