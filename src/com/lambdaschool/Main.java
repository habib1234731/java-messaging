package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
        MyApplication messaging = new MyApplication(); // hard coded dependecy
        messaging.send("Hello", "githuD");
    }
}
