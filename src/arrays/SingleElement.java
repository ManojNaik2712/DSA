package arrays;

public class SingleElement {
    private static int findSingle(int[] arr) {
        int xor = 0;

        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 5};

        System.out.println(findSingle(arr));
    }

}

/*
Time : O(N)
Space : O(1)
approach : XOR
 */