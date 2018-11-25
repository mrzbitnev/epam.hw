package com.zbitnev.epam.arrays;

import com.zbitnev.epam.arrays.exercises.AngleArray;
import com.zbitnev.epam.arrays.exercises.LetterArray;
import com.zbitnev.epam.arrays.exercises.StarArray;
import com.zbitnev.epam.arrays.exercises.StringArray;

public class Launcher {
    public void launch() {
        ArrayCreator arrayCreator = new ArrayCreator();
        AngleArray angleArray = new AngleArray();
        char[][] array = arrayCreator.getArray(5, 5);

        System.out.println("Our Array:");
        ArrayCreator.printArray(array);

        System.out.println("Four  angle: ");
        System.out.println(angleArray.getAngleArray(array));

        StringArray stringArray = new StringArray();
        System.out.println(stringArray.launchStringFromArray(array));

        StarArray starArray = new StarArray();
        System.out.println(starArray.getLetter(array));

        LetterArray letterArray = new LetterArray();
        System.out.println(letterArray.getEvenFromRow(array));
    }
}
