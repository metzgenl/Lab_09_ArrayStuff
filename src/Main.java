import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int [] dataPoints;
        dataPoints = new int[100];
        //Task 2
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        //Task 3
        for (int i = 0; i < dataPoints.length; i++){
            System.out.printf(dataPoints[i] + " | ");
        }
        //Task 4
        System.out.println();
        int sum = 0;
        double average = 0;
        for (int i = 0; i < dataPoints.length; i++){
            sum = dataPoints[i] + sum;
            average = dataPoints[i] + average;
        }
        average = average / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
        //Task 5
        Scanner in = new Scanner(System.in);
        int userInt = 0;
        userInt = SafeInput.getRangedInt(in, "Enter an integer value", 1,100);
        //Task 6
        int userIntCount = 0;
        for (int i = 0; i < dataPoints.length; i++){
            if (userInt == dataPoints[i]){
                userIntCount = userIntCount + 1;
            }
        }
        System.out.println("Your entered int value appeared " + userIntCount + " times in dataPoints!");
        //Task 7
        int userIntAgain = 0;
        Boolean checkFlag = false;
        userIntAgain = SafeInput.getRangedInt(in, "Enter a new integer value", 1,100);
        for (int i = 0; i < dataPoints.length; i++){
            if (userIntAgain == dataPoints[i]){
                System.out.println("The value " + userIntAgain + " was found at array index " + i + ".");
                checkFlag = true;
                break;
            }

            }
        if (!(checkFlag)){
            System.out.println("The value " + userIntAgain + " was not found in the dataPoints array");
        }
        //Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] > max){
                max = dataPoints[i];
            }
            if (dataPoints[i] < min){
                min = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the dataPoints array is " + min + ".");
        System.out.println("The maximum value in the dataPoints array is " + max + ".");
        //Task 9
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }
    public static double getAverage(int values[]){
        double average = 0;
        for (int i = 0; i < values.length; i++){
            average = values[i] + average;
        }
        average = average / values.length;

        return average;
    }
}