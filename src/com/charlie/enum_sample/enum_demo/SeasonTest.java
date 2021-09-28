package com.charlie.enum_sample.enum_demo;

public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}

enum Season {

    SPRING("spring", "warm"), SUMMER("summer", "hot"), AUTUMN("autumn", "cool"), WINTER("winter", "cold");

    private String name;
    private String climate;

    Season() {
    }

    Season(String name, String climate) {
        this.name = name;
        this.climate = climate;
    }

    public String getName() {
        return name;
    }

    public String getClimate() {
        return climate;
    }

    @Override
    public String toString() {
        return name + " " + climate;
    }
}
