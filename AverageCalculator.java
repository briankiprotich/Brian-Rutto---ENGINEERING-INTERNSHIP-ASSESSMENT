public class AverageCalculator {

    /**
     * This function calculates the average of a list of numbers.
     *
     * @param numbers The list of numbers.
     * @return The average.
     */
    public static double calculateAverage(int[] numbers) {
        // Initialize the total.
        double total = 0;

        // Iterate through the list of numbers, adding each number to the total.
        for (int num : numbers) {
            total += num;
        }

        // Calculate the average.
        double average = total / numbers.length;

        // Return the average.
        return average;
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        // Calculate the average of the list of numbers.
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}
