// DistanceFromAverage.java
// This program allows a user to enter up to 15 double values,
// then calculates and displays the average and the distance of each value from the average.
import java.util.Scanner;
public class DistanceFromAverage {
    public static void main(String[] args) {
        // Maximum number of values
        final int MAX_VALUES = 15;
        // Array to store up to 15 double values
        double[] numbers = new double[MAX_VALUES];
        int count = 0;              // Count of numbers entered
        double sum = 0.0;           // Sum of entered numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter up to 15 double values (enter 99999 to stop):");
        // Input loop
        while (count < MAX_VALUES) {
            System.out.print("Enter value #" + (count + 1) + ": ");
            double userInput = input.nextDouble();
            // Check for sentinel value
            if (userInput == 99999) {
                break;
            }
            // Store value and update sum
            numbers[count] = userInput;
            sum += userInput;
            count++;
        }
        // Check if no valid numbers were entered
        if (count == 0) {
            System.out.println("Error: No values were entered.");
        } else {
            // Calculate average
            double average = sum / count;
            // Display results
            System.out.println("\nNumber of values entered: " + count);
            System.out.printf("Average: %.2f\n", average);
            System.out.println("\nEach value and its distance from the average:");
            // Display each value and its distance from the average
            for (int i = 0; i < count; i++) {
                double distance = Math.abs(numbers[i] - average);
                System.out.printf("Value #%d: %.2f, Distance from average: %.2f\n", i + 1, numbers[i], distance);
            }
        }
        input.close();
    }
}