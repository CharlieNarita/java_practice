package com.charlie.enum_sample.enum_color;

public class ColorTest {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        System.out.println(green.show());


        switch (green) {
            case RED:
                System.out.println("it's red");
                break;
            case BLUE:
                System.out.println("it's blue");
                break;
            case BLACK:
                System.out.println("it's black");
                break;
            case YELLOW:
                System.out.println("it's yellow");
                break;
            case GREEN:
                System.out.println("it's green");
                break;
            default:
                System.out.println("no color matched");
        }
    }
}

interface Visible {
    String show();
}

enum Color implements Visible{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public String show() {
        return "red value = " + redValue + "\n" +
        "green value = " + greenValue + "\n" +
        "blue value = " + blueValue;
    }
}

