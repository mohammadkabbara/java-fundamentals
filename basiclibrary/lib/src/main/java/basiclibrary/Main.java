package basiclibrary;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Library callingFunc = new Library();

        int[] myArray = callingFunc.roll(4);
        System.out.println(Arrays.toString(myArray));
        System.out.println(callingFunc.containsDuplicates(myArray));
        System.out.println(callingFunc.average(myArray));

        int [][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(Arrays.toString(callingFunc.lowAvg(weeklyMonthTemperatures)));
    }
}