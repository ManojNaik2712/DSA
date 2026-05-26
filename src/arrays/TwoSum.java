package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int compliment = target - arr[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={2,3,7,8,4};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}

/* Time : O(N)
   Space : O(N)
 */