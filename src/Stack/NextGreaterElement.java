package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    private static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            //Removing smaller element from stack to find bigger element on right of the array
            while (!stack.isEmpty() && stack.peek() < arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 3};

        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}

/*
    Time : O(n)
    Space ; O(n)
 */