package com.lambdaschool;

public class LambdaTextingServiceInjector implements MessageServiceInjector {
    @Override
    public Processor getProcess() {
        return new MyApplication(new LambdaTextingServiceImpl());
    }
}
