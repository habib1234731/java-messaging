package com.lambdaschool;

public class MyApplication implements Processor{
//    private MessageService msgSrv = new MessageService(); // hard coded dependecy

    private MessageService msgSrv;

    public MyApplication(MessageService msgSrv) {
        this.msgSrv = msgSrv;
    }
    @Override
    public void sendMessage(String msg, String receiveAddress) {
        msg = msg + "\n *** FOR YOUR EYES ONLY***";
        msgSrv.sendMessage(msg, receiveAddress);
    }

    @Override
    public String readMessage() {
        return "Not Implemented";
    }

}
