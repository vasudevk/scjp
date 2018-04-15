package io.learn;

import io.learn.ams.Draw;

public class Circle {

    private int xPos, yPos, radius;

    // default constructor initializing all the three fields
    public Circle() {
        xPos = 20;
        yPos = 20;
        radius = 10;
    }

    public Circle(int x, int y) {
        // invoke one constructor from another constructor
        this(x, y, 10);
    }

    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    public static void main(String[] args) {

        System.out.println(new Circle());
        System.out.println(new Circle(50, 100));
        System.out.println(new Circle(50, 100, 15));
    }


    @Override
    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }


}
