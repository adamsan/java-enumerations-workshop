package com.codecool.enums.task2;

public class App {
    public static void main(String[] args) {
        WashMachine w = new WashMachine();
        w.startProgram(HeatLevel.HIGH, "black");
        w.startProgram(HeatLevel.MEDIUM, "mixed");
        w.startProgram(HeatLevel.LOW, "red");
    }
}
