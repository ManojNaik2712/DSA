package arrays;

public class FindLargest {

    public static int findLargest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 9, 7, 6};

        System.out.println(findLargest(arr));
    }
}
