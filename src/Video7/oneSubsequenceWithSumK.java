package Video7;

import java.util.ArrayList;
import java.util.List;

public class oneSubsequenceWithSumK
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int k = 10;

        List<Integer> subsequence = getOneSubsequenceWithSumK(arr, k);
        if (subsequence != null) {
            System.out.println("Subsequence with sum " + k + ": " + subsequence);
        } else {
            System.out.println("No subsequence found with sum " + k);
        }
    }

    public static List<Integer> getOneSubsequenceWithSumK(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        generateOneSubsequenceWithSumK(arr, 0, k, result);
        return result.isEmpty() ? null : result;
    }

    private static boolean generateOneSubsequenceWithSumK(int[] arr, int index, int targetSum,
                                                          List<Integer> current) {
        if (index == arr.length) {
            int sum = 0;
            for (int num : current) {
                sum += num;
            }
            if (sum == targetSum) {
                return true;
            }
            return false;
        }

        // Include the current element
        current.add(arr[index]);
        if (generateOneSubsequenceWithSumK(arr, index + 1, targetSum, current)) {
            return true;
        }

        // Exclude the current element
        current.remove(current.size() - 1);
        return generateOneSubsequenceWithSumK(arr, index + 1, targetSum, current);
    }
}
