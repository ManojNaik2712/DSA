package arrays;

public class LeftRotateArrayByOne {
    public static void leftRotate(int[] arr){
        int first=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=first;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 7, 6};
        leftRotate(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}

/* Time : O(N)
   Space : O(1)
 */