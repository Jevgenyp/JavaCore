package org.Lesson2;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 0, 4, 3, 0, 0, 1, 2};
        countingSort(array, 5); // 5 - максимальное значение в массиве
        printArray(array);
    }

    public static void countingSort(int[] arr, int maxRange) {
        int[] count = new int[maxRange + 1];
        int[] output = new int[arr.length];

        // Подсчитываем количество каждого элемента
        for (int num : arr) {
            count[num]++;
        }

        // Заполняем output отсортированными значениями
        int index = 0;
        for (int i = 0; i <= maxRange; i++) {
            while (count[i] > 0) {
                output[index] = i;
                index++;
                count[i]--;
            }
        }

        // Копируем отсортированный массив обратно в исходный
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

