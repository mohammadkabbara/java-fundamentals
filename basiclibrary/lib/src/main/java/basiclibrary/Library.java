/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;


import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;


public class Library {

    public static void main(String[] args) {

    }


    public int[] roll(int numRoll) {

        int[] array = new int[numRoll];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (5 * Math.random()) + 1;
        }
        return array;
    }

    public boolean containsDuplicates(int[] inputArray) {
        boolean value = false;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]){
                    value = true;
                }
            }
        }
        return value;
    }

    public double average(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
        double avg = (double) sum / inputArray.length;
        return avg;
    }

    public int[] lowAvg(int [][] arr) {
        ArrayList<Double> averageCollection = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            averageCollection.add(sum / arr[i].length);
        }
        return arr[averageCollection.indexOf(Collections.min(averageCollection))];
    }

    public static int[] roll(int n) {
        int min = 1;
        int max = 6;

        int[] myRolls;
        myRolls = new int[n];
        for (int i = 0; i < n; i++) {
            myRolls[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
//            System.out.println(myRolls[i]);
        }

//        System.out.println("out of method");
        return myRolls;
    }
    ////////////////////////////////task2
    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    // if Duplicates => true
                    System.out.println("true");
                    return true;
                }

            }
        }

        //if not Duplicates => false
        System.out.println("false");
        return false;
    }
    ////////////////////////////task3
    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }
//////////////////task 4

    public static int[] lowestAverage(int[][] array) {
        double sum = 0;
        double avg = 0;
        double firstSum = 0;
        double firstAverage = 0;
        int value = 0;
        int[] lowestAvgArr;
        for (int i = 0; i < array[0].length; i++) {
            firstSum = firstSum + array[0][i];
            firstAverage = firstSum/array[0].length;
        }
        double lowAvg = firstAverage;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum=sum+array[i][j];
                avg=sum/array[i].length;

            }
            if(avg<lowAvg){
                lowAvg=avg;
                value=i;

            }
            sum=0;
            avg=0;
        }
        lowestAvgArr=array[value];
        return lowestAvgArr;
    }

    public static String analyze(int[][] array){
        int min = array[0][0];
        int max = array[0][0];
        for(int i = 0 ; i<array.length ; i++){
            for(int j = 0 ; j< array[i].length ; j++){
                if(min>=array[i][j]){
                    min=array[i][j];
                }
                else if (max<=array[i][j]){
                    max=array[i][j];
                }
            }
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i<array.length ; i++){
            for(int j = 0 ; j< array[i].length ; j++){
                set.add(array[i][j]);
            }
        }

        String str = "High : " + max + "\n" + "Low : " + min ;
        for(int i = min ; i < max ; i++){
            if(set.contains(i)){
            }
            else{
                str = str.concat("\n"+"Never saw temperature: " + i);
            }
        }
        System.out.println(str);
        return str;
    }


    public static String tally(List<String> votes) {

        HashSet<String> votedItems = new HashSet<>();
        votedItems.addAll(votes);

        int numVotes = 0;
        String winner = null;

        for (String item : votedItems) {
            int count = Collections.frequency(votes, item);
            if (numVotes < count) {
                numVotes = count;
                winner = String.format("%s received the most votes!", item);
            } else if (numVotes == count) {
                winner = "re vote is needed";
            }
        }

        return winner;
    }
}

}
