package org.Lesson2.hw;

public class HwMain {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 3, 4};
        System.out.println(ArrayUtils.countEvens(arr1)); // Ожидаемый результат: 3

        int[] arr2 = {2, 2, 0};
        System.out.println(ArrayUtils.countEvens(arr2)); // Ожидаемый результат: 3

        int[] arr3 = {1, 3, 5};
        System.out.println(ArrayUtils.countEvens(arr3)); // Ожидаемый результат: 0

        int[] arr4 = {1, 4, 7, 0, 0, 9};
        System.out.println(ArrayUtils.hasConsecutiveZeros(arr4)); // Ожидаемый результат: true

        int[] arr5 = {3, 8, 15, 20, 4};
        System.out.println(ArrayUtils.differenceMaxMin(arr5)); // Ожидаемый результат: 17
    }
}







