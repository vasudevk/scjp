package io.learn.ams;

public class Draw extends Shape {

    private int radius;

    public void area() {
        // access to private field radius inside the class
        System.out.println("area:" + 3.14 * radius * radius);
    }

    void fillColor() {
        System.out.println("color:" + color); //access to protected field, in subclass
    }

    public void fillColor(int red, int green, int blue) {
        /* color the circle using RGB color values – actual code elided */
    }

    public void fillColor(float hue, float saturation, float brightness) {
        /* color the circle using HSB values – actual code elided */
    }
}