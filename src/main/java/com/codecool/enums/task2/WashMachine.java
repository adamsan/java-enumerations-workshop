package com.codecool.enums.task2;

public class WashMachine {
    public void startProgram(HeatLevel level, String color) {
        String levelString = level.repr;
        System.out.printf("Running %2$s color program on heat level: %1$s%n", levelString, color);
    }
}

class HeatLevel {
    public static final HeatLevel LOW = new HeatLevel("low");
    public static final HeatLevel MEDIUM = new HeatLevel("medium");
    public static final HeatLevel HIGH = new HeatLevel("high");

    public final String repr;

    private HeatLevel(String repr) {
        this.repr = repr;
    }
}
