package com.zbitnev.epam.trafficlight;

public enum Colors {
    RED(1),
    YELLOW(4),
    GREEN(9);

    private int numberColor;

    Colors(int numberColor) {
        this.numberColor = numberColor;
    }

    Colors getColorByNumber(int number) {
        for (Colors color : Colors.values()) {
            if (color.numberColor >= number) {
                return color;
            }
        }
        return null;
    }
}
