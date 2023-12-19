package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird (String color, int numberOfPaws, boolean hasFur) {
        super("blue", 2, false);
    }

    @Override
    String getDescription() {
        String returnStr = super.getDescription() + " Moreover, it has 2 wings and can fly.";
        return returnStr;

    }
}
