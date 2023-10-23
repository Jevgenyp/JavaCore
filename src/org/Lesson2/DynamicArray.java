package org.Lesson2;

import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        int elementToAdd = 4;

        int[] newArray = addElement(originalArray, elementToAdd);

        System.out.println(Arrays.toString(newArray)); // Вывод нового массива
    }

    public static int[] addElement(int[] arr, int element) {
        int length = arr.length;
        int[] newArray = Arrays.copyOf(arr, length + 1); // Создание нового массива большего размера

        newArray[length] = element; // Добавление элемента в конец нового массива

        return newArray; // Возвращение нового массива
    }
}
