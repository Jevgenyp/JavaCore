package org.Lesson2.hw;



public class ArrayUtils {

    // Функция для подсчета четных чисел
    public static int countEvens(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Функция для нахождения разницы между максимальным и минимальным значениями
    public static int differenceMaxMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    // Функция для проверки наличия двух соседних нулей
    public static boolean hasConsecutiveZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }


}
