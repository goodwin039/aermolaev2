package ru.job4j.max;

public class Max {
    public int max(int first, int second){
        int maxValue = first > second ? first : second;
        return maxValue;
    }

    public int max(int first, int second, int third) {
        max(first, second);
        return max(max(first, second), third);
    }
}
