package arrays;

public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr){

        int currentSum = 0;
        int maximumSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maximumSum = Math.max(maximumSum,currentSum);

            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maximumSum;
    }
    public static void main(String[] args) {
        int[] arr = {-5,-2,-8};

        System.out.println(maxSubarraySum(arr));
    }
}

/* Time : O(N)
   Space : O(1)
   Approach : kadens algorithm
 */