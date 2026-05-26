package arrays;

import java.util.HashMap;

public class MajorityElement {
    private static int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int num: arr){
            map.put(num, map.getOrDefault(num,0) + 1);

            if (map.get(num) > arr.length/2){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,2,2,2};
        System.out.println(majorityElement(arr));
    }
}

/*
   Time : O(N)
   Space : O(N)
 */