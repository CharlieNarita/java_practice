package com.charlie.polymorph.anonymous_apply;

public class AnonymousInnerClassApply {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.run(new Processable() {
            @Override
            public void process() {
                System.out.println("processor is running");
            }
        });

    }
}

interface Processable {
    void process();
}

class Computer {
    public void run(Processable p) {
        p.process();
    }
}