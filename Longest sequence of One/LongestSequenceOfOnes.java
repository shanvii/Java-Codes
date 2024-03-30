public class LongestSequenceOfOnes {
    public static int longestSequenceOfOnes(int binaryNumber) {
        // Convert the binary number to a binary string
        String binaryString = Integer.toBinaryString(binaryNumber);
        int count = 0; // Variable to store the current count of consecutive ones
        int maxCount = 0; // Variable to store the maximum count of consecutive ones

        // Iterate through each digit of the binary string
        for (char digit : binaryString.toCharArray()) {
            if (digit == '1') {
                // If the current digit is '1', increment the count
                count++;
                // Update the maxCount if the current count is greater
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                // If the current digit is not '1', reset the count
                count = 0;
            }
        }
        return maxCount; // Return the length of the longest sequence of consecutive ones
    }

    public static void main(String[] args) {
        // Binary representation of 87769
        int binaryNumber = 0b1101110111111001;
        // Call the method to find the longest sequence of ones
        int longestSequence = longestSequenceOfOnes(binaryNumber);
        // Print the result
        System.out.println(
                "The longest sequence of 1's in " + Integer.toBinaryString(binaryNumber) + " is: " + longestSequence);
    }
}
