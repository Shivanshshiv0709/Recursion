package Video7;

import java.util.ArrayList;
import java.util.List;

public class allSubsequenceWithSumK
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int k = 10;

        List<List<Integer>> subsequences = getSubsequencesWithSumK(arr, k);
        for (List<Integer> i : subsequences) {
            System.out.println(i);
        }
    }

    public static List<List<Integer>> getSubsequencesWithSumK(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generateSubsequencesWithSumK(arr, 0, k, current, result);
        return result;
    }

    private static void generateSubsequencesWithSumK(int[] arr, int index, int targetSum,
                                                     List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            int sum = 0;
            for (int num : current) {
                sum += num;
            }
            if (sum == targetSum) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        // Include the current element
        current.add(arr[index]);
        generateSubsequencesWithSumK(arr, index + 1, targetSum, current, result);

        // Exclude the current element
        current.remove(current.size() - 1);
        generateSubsequencesWithSumK(arr, index + 1, targetSum, current, result);
    }
}
