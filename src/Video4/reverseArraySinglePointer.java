package Video4;

public class reverseArraySinglePointer
{
    public static void reverseArray(int[] arr, int i) {
        int n = arr.length;

        if (i >= n / 2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverseArray(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] array = {20, 19, 13, 24, 45};

        System.out.println("Original Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        reverseArray(array, 0);

        System.out.println("\nReversed Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
