package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
        MyApplication messaging = new MyApplication(new MessageService());
        messaging.send("Hello", "githuD");
    }
}
