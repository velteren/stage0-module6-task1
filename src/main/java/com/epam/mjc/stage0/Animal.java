package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    String getDescription() {
        String furStr = hasFur ? "a" : "no";
        String pawStr = numberOfPaws == 1 ? " paw" : " paws";
        String str = "This animal is mostly " + color + ". It has " + numberOfPaws + pawStr + " and " + furStr + " fur.";
        return  str;
    }
}
