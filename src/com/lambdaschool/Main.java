package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
//        MyApplication messaging = new MyApplication(new MessageService());
//        messaging.send("Hello", "github");
        String myMsg = "Come Here-- I want to see you.";
        String myAddress = "Mr. Watson";
        String myText = "Watson";

        MessageServiceInjector injector;
        Processor app;

        injector = new LambdaMessageInjector();
        app = injector.getProcess();
        app.sendMessage(myMsg, myAddress);

        System.out.println("\n\n");

        injector = new LambdaTextingServiceInjector();
        app = injector.getProcess();
        app.sendMessage(myMsg, myText);

        System.out.println("\n\n");

        injector = new LambdaTeletypeServiceInjector();
        app = injector.getProcess();
        app.sendMessage(myMsg, myAddress);

    }
}
