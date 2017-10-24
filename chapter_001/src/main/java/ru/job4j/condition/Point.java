package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean is(int a, int b) {
        if(getY() == (a * getX() + b))	return true; // используя оператор if проверить что точка (x, y) принадлежит функции y(x) = a * x + b;
        else return false;
    }
}