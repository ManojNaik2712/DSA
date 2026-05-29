package BinarySearch;

public class RoatatedBinarySearch {
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (arr[low] <= arr[mid]) {

                if (target >= arr[low] &&
                        target < arr[mid]) {

                    high = mid - 1;

                } else {

                    low = mid + 1;
                }

            }

            // Right half sorted
            else {
                if (target > arr[mid] &&
                        target <= arr[high]) {

                    low = mid + 1;

                } else {

                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(search(arr, 0));
    }
}

/*
    Time : O(logn)
    Space : O(1)
    Approach : Binary Search
 */