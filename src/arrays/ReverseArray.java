package arrays;

import java.util.Arrays;

public class ReverseArray {
    private static void reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 7, 6};

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }

}

/* Time : O(N)
   Space : o(1)
   Approach : Two Pointer
 */
