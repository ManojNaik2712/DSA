package arrays;
 /*Problem
Given an array containing numbers from:
1 to n
One number is missing.
Find the missing number.
  */
public class MissingNumber {
    public static int missingNumber(int[] arr,int n){
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num: arr){
            actualSum +=num;
        }

        return expectedSum - actualSum;
    }
     public static void main(String[] args) {
         int[] arr = {1,2,3,5};
         int n = 5;
         System.out.println(missingNumber(arr,n));
     }
}

/* Time : O(N)
   Space : O(1)
 */