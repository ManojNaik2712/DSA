package BinarySearch;

public class SqaureRootElement {
    public static int sqrt(int n) {
        int low = 1;
        int high = n;

        int answer = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == n) {
                return mid;

            } else if (square < n) {
                answer = mid;
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(sqrt(20));
    }
}

/*
    Time : O(logn)
    Space : O(1)
    Approach : Binary Search
 */