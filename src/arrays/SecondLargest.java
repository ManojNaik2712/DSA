package arrays;

public class SecondLargest {
    public static int SecondLargest(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];

            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 5};

        System.out.println(SecondLargest(arr));
    }
}

/* Time complexity : O(N)
   Space complexity : O(1)
 */
