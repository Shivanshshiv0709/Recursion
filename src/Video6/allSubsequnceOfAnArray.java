package Video6;

import java.util.ArrayList;
import java.util.List;

public class allSubsequnceOfAnArray
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printAllSubsequences(arr);
    }

    public static void printAllSubsequences(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generateSubsequences(arr, 0, current, result);

        for (List<Integer> subsequence : result) {
            System.out.println(subsequence);
        }
    }

    private static void generateSubsequences(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(arr[index]);
        generateSubsequences(arr, index + 1, current, result);

        // Exclude the current element
        current.remove(current.size() - 1);
        generateSubsequences(arr, index + 1, current, result);
    }
}
