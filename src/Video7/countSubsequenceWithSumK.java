package Video7;

public class countSubsequenceWithSumK
{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10};
        int k = 16;

        int count = countSubsequencesWithSumK(arr, k);
        System.out.println("Number of subsequences with sum " + k + ": " + count);
    }

    public static int countSubsequencesWithSumK(int[] arr, int k) {
        return countSubsequences(arr, 0, k, 0);
    }

    private static int countSubsequences(int[] arr, int index, int targetSum, int currentSum) {
        if (index == arr.length) {
            if (currentSum == targetSum) {
                return 1;
            }
            return 0;
        }

        // Include the current element
        int includeCount = countSubsequences(arr, index + 1, targetSum, currentSum + arr[index]);

        // Exclude the current element
        int excludeCount = countSubsequences(arr, index + 1, targetSum, currentSum);

        // Total count is the sum of counts including and excluding the current element
        return includeCount + excludeCount;
    }
}
