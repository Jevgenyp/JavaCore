package org.Lesson2;

public class Main {
    //Задача: Задать одномерный массив. Написать методы поиска в нём
    //минимального и максимального элемента;
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 2, 15, 3};

        int minElement = findMin(array);
        int maxElement = findMax(array);

        System.out.println("Минимальный элемент: " + minElement);
        System.out.println("Максимальный элемент: " + maxElement);
    }

    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }


}

