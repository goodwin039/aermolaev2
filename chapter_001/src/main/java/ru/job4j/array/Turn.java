package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        if ((array.length <= 1) || (array == null)) {
            return null;
        }

        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
