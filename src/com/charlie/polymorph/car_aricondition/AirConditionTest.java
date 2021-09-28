package com.charlie.polymorph.car_aricondition;

public class AirConditionTest {
    public static void main(String[] args) {
        Car car = new Car(30);
        car.getAirCondition().flow();
    }
}

class Car {
    private int temperature;

    public Car(int temperature) {
        this.temperature = temperature;
    }

    class AirCondition {
        void flow() {
            if (temperature <= 0) {
                System.out.println("turn on the heater");
            } else if (temperature >= 35) {
                System.out.println("turn on the cooler");
            } else {
                System.out.println("turn off the air condition");
            }
        }
    }

    public AirCondition getAirCondition() {
        return new AirCondition();
    }
}

