package com.charlie.enum_sample.enum_method;

public class EnumMethod {
    public static void main(String[] args) {
        Season spring = Season.SPRING;

        //name()
        System.out.println(spring.name());

        //ordinal()-->the index of sequence
        System.out.println(spring.ordinal());

        //values()  javap can see this method
        Season[] values = Season.values();
        for (Season season : values) {
            System.out.println(season);
        }

        //valueOf()
        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer);

        //compareTo()   compare the index of sequence
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;
        System.out.println(autumn.compareTo(winter));

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

