package arrays;

import java.util.ArrayList;

public class LeaderInArray {
    private static ArrayList<Integer> leadersInArray(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = arr[arr.length - 1];

        leaders.add(max);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println((leadersInArray(arr)));
    }
}

/*
   Time : O(N)
   Space : O(N)
 */