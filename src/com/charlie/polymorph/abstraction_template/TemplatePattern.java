package com.charlie.polymorph.abstraction_template;

public class TemplatePattern {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.calculateTime();

        Sub2 sub2 = new Sub2();
        sub2.calculateTime();
    }
}

abstract class Template {

    public abstract void job();

    public void calculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("the job take " + (end - start));
    }
}

class Sub extends Template {
    @Override
    public void job() {
        long sum = 0;
        for (long i = 1; i <= 10000000; i++) {
            sum += i;
        }
    }
}

class Sub2 extends Template {
    @Override
    public void job() {
        long sum = 0;
        for (long i = 1; i <= 10000000; i++) {
            sum *= i;
        }
    }
}
