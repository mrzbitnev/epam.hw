package com.zbitnev.epam.trafficlight;

public class ApplicationMain {
    public static void main(String[] args) {
        System.out.println("Please enter a number to know what's color of traffic lights in that minute");
        System.out.println("Or type \"quit\" to exite");
        Number number = new Number();

        while (true) {
            System.out.println(Colors.GREEN.getColorByNumber(number.getNumber()));
        }
    }
}