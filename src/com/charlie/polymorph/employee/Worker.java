package com.charlie.polymorph.employee;

class Worker extends Employee{

    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public String work() {
        return getName() + " work in product line...";
    }
}
