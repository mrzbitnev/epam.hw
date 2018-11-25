package com.zbitnev.epam.arrays.exercises;

/**
 * The AngleArray get symbol from angle array and return string of it;
 *
 * @version 1.0
 * @exercise 12.270;
 * @autor Ivan Zbitnev
 */
public class AngleArray {
    public String getAngleArray(char[][] array) {
        int bigCircleSize = array.length;
        int smallCircleSize = array[0].length;

        if (bigCircleSize > 1 & smallCircleSize > 1) {
            int leftAngleTopFirstArr = 0;
            int leftAngleTopSecondArr = 0;
            int rightAngleTopFirstArr = 0;
            int rightAngleTopSecondArr = smallCircleSize - 1;
            int leftAngleBottomFirstArr = bigCircleSize - 1;
            int leftAngleBottomSecondArr = 0;
            int RightAngleBottomFirstArr = bigCircleSize - 1;
            int RightAngleBottomSecondArr = smallCircleSize - 1;

            return "" + array[leftAngleTopFirstArr][leftAngleTopSecondArr] +
                    array[rightAngleTopFirstArr][rightAngleTopSecondArr] +
                    array[leftAngleBottomFirstArr][leftAngleBottomSecondArr] +
                    array[RightAngleBottomFirstArr][RightAngleBottomSecondArr];
        }
        return "You give too small array, try again, SIZE [2][2] or more";
    }
}
