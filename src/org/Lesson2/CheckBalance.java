package org.Lesson2;

public class CheckBalance {
    public static void main(String[] args) {
        int[] array1 = {3, -2, -2, 2, 1};
        int[] array2 = {2, 3, 2, 2, 1};
        int[] array3 = {10, 1, 2, 3, 4};

        System.out.println(checkBalance(array1));
        System.out.println(checkBalance(array2));
        System.out.println(checkBalance(array3));
    }

    public static boolean checkBalance(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isBalanced(arr, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isBalanced(int[] arr, int pivot) {
        int leftSum = 0;
        int rightSum = 0;


        for (int i = 0; i < pivot; i++) {
            leftSum += arr[i];
        }


        for (int i = pivot; i < arr.length; i++) {
            rightSum += arr[i];
        }

        return leftSum == rightSum;
    }
}
