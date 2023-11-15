package Video4;

public class reverseArray
{
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] array = {11, 12, 13, 14, 15};

        System.out.println("Original Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        reverseArray(array, 0, array.length - 1);

        System.out.println("\nReversed Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
