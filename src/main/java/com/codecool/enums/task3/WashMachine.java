package com.codecool.enums.task3;

public class WashMachine {
    public void startProgram(HeatLevel level, String color) {
        String levelString = level.repr;
        System.out.printf("Running %2$s color program on heat level: %1$s%n", levelString, color);
    }
}

enum HeatLevel {
    LOW("low"), MEDIUM("medium"), HIGH("high");

    public final String repr;

    HeatLevel(String repr) {
        this.repr = repr;
    }
}
