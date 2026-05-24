package arrays;

public class MaximumCosecutiveOnes {
    public static int maximumOnes(int[] arr){
        int maxCount = 0;
        int count = 0;

        for(int num: arr){
            if(num == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else{
                count = 0;
            }
        }
      return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1};
        System.out.println(maximumOnes(arr));

    }
}
