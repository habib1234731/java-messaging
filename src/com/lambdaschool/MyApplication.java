package com.lambdaschool;

public class MyApplication {
    private MesageService msgSrv = new MesageService();
    public void send(String msg, String receiveAddress) {
        //rules of message
        msg = msg + "\n *** FOR YOUR EYES ONLY***";
        msgSrv.sendMessage(msg, receiveAddress);
    }
}
