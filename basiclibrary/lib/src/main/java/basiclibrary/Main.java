package basiclibrary;
public class Main {
    public static void main(String[] args) {
        int numRolls = 4;
        int[] newRolls = roll(numRolls);
        for (int i = 0; i < numRolls; i++) {
            System.out.println(newRolls[i]);
        }
        containsDuplicates(newRolls);
        double average = average(newRolls);
        System.out.println(average);


        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        int[] lowestAvgArr = lowestAverage(weeklyMonthTemperatures);
        for(int i = 0 ; i < lowestAvgArr.length ; i++){
            System.out.println(lowestAvgArr[i]);
        }
    };

/////////////////////////////// task 1
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
}
