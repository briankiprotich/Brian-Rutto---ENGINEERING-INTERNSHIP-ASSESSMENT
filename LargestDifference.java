import java.util.List;

public class LargestDifference {

    /**
     * This function finds the largest difference between any two numbers in a list.
     *
     * @param numbers The list of numbers.
     * @return The largest difference.
     */
    public static int findLargestDifference(List<Integer> numbers) {
        // Check if the list has less than two elements.
        if (numbers.size() < 2) {
            // Return 0 if the list has less than two elements.
            return 0;
        }

        // Initialize the minimum number as the first element in the list.
        int smallestNumber = numbers.get(0);

        // Initialize the maximum difference as 0.
        int largestDifference = 0;

        // Iterate through the list, comparing each number to the minimum number.
        for (int i = 1; i < numbers.size(); i++) {
            // Get the current number.
            int currentNumber = numbers.get(i);

            // Calculate the difference between the current number and the minimum number.
            int difference = currentNumber - smallestNumber;

            // Update the maximum difference if a larger difference is found.
            if (difference > largestDifference) {
                largestDifference = difference;
            }

            // Update the minimum number if a smaller number is found.
            if (currentNumber < smallestNumber) {
                smallestNumber = currentNumber;
            }
        }

        // Return the maximum difference.
        return largestDifference;
    }
}
