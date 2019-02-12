package com.lambdaschool;

public class LambdaMessageInjector implements MessageServiceInjector {
    @Override
    public Processor getProcess() {
        return new MyApplication(new LambdaMessageImpl());
    }
}
