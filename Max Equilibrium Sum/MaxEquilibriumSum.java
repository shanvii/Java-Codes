public class MaxEquilibriumSum {
    public static int getMaxEquilibriumSumOptimized(int[] arr) {
        int totalSum = 0; // Variable to store the total sum of the array
        int leftSum = 0; // Variable to store the left sum during traversal
        int maxSum = Integer.MIN_VALUE; // Variable to store the maximum equilibrium sum

        // Calculating the total sum of the array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Iterating through the array to find the equilibrium sum
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Subtracting the current element from the total sum

            // Checking if the left sum is equal to the total sum (equilibrium condition)
            // and if it is greater than the current maximum sum
            if (leftSum == totalSum && leftSum > maxSum) {
                maxSum = leftSum; // Updating the maximum sum
            }

            leftSum += arr[i]; // Adding the current element to the left sum
        }

        return maxSum; // Returning the maximum equilibrium sum
    }

    // Main method to test the getMaxEquilibriumSumOptimized function
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int maxSum = getMaxEquilibriumSumOptimized(arr);
        System.out.println("Max Equilibrium Sum : " + maxSum);
    }
}
