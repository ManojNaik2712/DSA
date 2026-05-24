package arrays;

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 0, 7, 6};
        moveZeros(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/* Time : O(N)
   Space : O(1)
   Approach : Two Pointer
 */